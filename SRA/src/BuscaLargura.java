import java.util.*;

public class BuscaLargura {
    private Rede r;
    private Cor[] cores;
    private int[] distancia;
    private int[] pai;

    ArrayList<Integer> pesos=new ArrayList<>();

    ArrayList<String> ordemAchados = new ArrayList<>();

    ArrayList<Pessoa> recomendar = new ArrayList<>();

    public BuscaLargura(Rede r) {
        this.r = r;
        this.cores = new Cor[r.getNumeroVertices()];
        this.distancia = new int[r.getNumeroVertices()];
        this.pai = new int[r.getNumeroVertices()];


    }

    public void inicializar() {
       for (int i = 0; i < r.getNumeroVertices(); i++) {
            this.cores[i] = Cor.BRANCO;
            this.distancia[i] = -1;
            this.pai[i] = -1;
        }
    }
    public void execute(Pessoa p) {

        int inicio = r.getIndiceVertice(p);
        inicializar();
        Queue<Integer> fila = new LinkedList<>();
        this.cores[inicio] = Cor.CINZA;
        ordemAchados.add(r.getMapa().get(inicio).getNome());
        this.distancia[inicio] = 0;
        fila.add(inicio);
        int peso;

        while (fila.size() > 0) {
            System.out.println(fila);
            int v = fila.poll();
            List<Integer> adjacenciaV = r.listarAdjacencias(v);
            for (int u : adjacenciaV) {
                if (this.cores[u] == Cor.BRANCO) {
                    this.pai[u] = v;
                    this.distancia[u] = this.distancia[v] + 1;
                    this.cores[u] = Cor.CINZA;
                    ordemAchados.add(r.getMapa().get(u).getNome());
                    peso = CalcularPeso(inicio,u);
                    pesos.add(peso);
                    fila.add(u);
                }
            }
        }

    }
    public void imprimir() {
        System.out.println("Cores");
        for (Cor c : this.cores)
            System.out.print(c + " | ");
        System.out.println("\n\nPai");
        for (int p : this.pai)
            System.out.print(p + " | ");
        System.out.println("\n\nDistancia");
        for (int d : this.distancia)
            System.out.print(d + " | ");
        System.out.println("");
        System.out.println("\n\nOrdem que foram achados");
        for (String o : this.ordemAchados )
            System.out.print(o + " -> ");
        System.out.println("");
        System.out.println("\n\nPesos com a origem");
        for (int p : this.pesos )
            System.out.print(p + " - ");
        System.out.println("");
        System.out.println("\n\nRecomendação");
        for (Pessoa p : this.recomendar )
            System.out.print(p.getNome() + " - ");
        System.out.println("");
    }
    public int CalcularPeso(int i, int j){
       int peso;

       peso = r.ponderar(r.getMapa().get(i),r.getMapa().get(j));

       switch (this.distancia[j]){
           case 1:
               peso = peso *1;
               break;

           case 2:
               peso = (int) Math.round(peso * 0.5);
               r.getMapa().get(j).setPeso(peso);
               this.recomendar.add(r.getMapa().get(j));
                break;
           case 3:
               peso = (int) Math.round(peso * 0.4);
               r.getMapa().get(j).setPeso(peso);
               this.recomendar.add(r.getMapa().get(j));
                break;
           case 4:
               peso = (int) Math.round(peso * 0.3);
               r.getMapa().get(j).setPeso(peso);
               this.recomendar.add(r.getMapa().get(j));
                break;
           case 5:
               peso = (int) Math.round(peso * 0.2);
               r.getMapa().get(j).setPeso(peso);
               this.recomendar.add(r.getMapa().get(j));
                break;
           default:
               peso=0;
       }
       Collections.sort(recomendar);
        return peso;

    }

}