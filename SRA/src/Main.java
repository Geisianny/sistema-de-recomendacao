import java.util.ArrayList;
/**
 *Classe responsável pela recomendação de pessoas
 * 
 * @author Geisianny e Rodrigo
 */
public class Main {

    public static void main(String[] args) {
        
        Repositorio repositorio = new Repositorio();
        repositorio.bancoCom30pessoas();
        
        ArrayList<Pessoa> list = repositorio.lista;
           
                    
        Rede rede = new Rede(list.size());
            
        for (int i=0;i< list.size();i++){
            rede.adicionarVertice(list.get(i));
        }
            
        rede.adicionarAresta(list.get(6),list.get(1));
        rede.adicionarAresta(list.get(6),list.get(5));
        rede.adicionarAresta(list.get(5),list.get(1));
        rede.adicionarAresta(list.get(1),list.get(7));
        rede.adicionarAresta(list.get(1),list.get(4));
        rede.adicionarAresta(list.get(7),list.get(3));
        rede.adicionarAresta(list.get(4),list.get(3));
        rede.adicionarAresta(list.get(4),list.get(8));
        rede.adicionarAresta(list.get(8),list.get(9));
        rede.adicionarAresta(list.get(9),list.get(3));
        rede.adicionarAresta(list.get(3),list.get(2));
        rede.adicionarAresta(list.get(9),list.get(0));
        rede.adicionarAresta(list.get(0),list.get(7));
        rede.adicionarAresta(list.get(4),list.get(0));
        rede.adicionarAresta(list.get(4),list.get(5));
        rede.adicionarAresta(list.get(12),list.get(4));
        rede.adicionarAresta(list.get(12),list.get(10));
        rede.adicionarAresta(list.get(13),list.get(11));
        rede.adicionarAresta(list.get(10),list.get(12));
        rede.adicionarAresta(list.get(11),list.get(0));
        rede.adicionarAresta(list.get(11),list.get(1));
        rede.adicionarAresta(list.get(13),list.get(3));
        rede.adicionarAresta(list.get(14),list.get(9));
        rede.adicionarAresta(list.get(14),list.get(11));
        rede.adicionarAresta(list.get(14),list.get(12));
        rede.adicionarAresta(list.get(13),list.get(5));
        rede.adicionarAresta(list.get(15),list.get(6));
        rede.adicionarAresta(list.get(16),list.get(8));
        rede.adicionarAresta(list.get(17),list.get(3));
        rede.adicionarAresta(list.get(18),list.get(15));
        rede.adicionarAresta(list.get(19),list.get(4));
        rede.adicionarAresta(list.get(20),list.get(0));
            
        rede.imprimirMapa();
            
            
        System.out.println("\n");
        rede.imprimir();
        System.out.println("\n");
            
        for (int i=0;i< list.size();i++){
            System.out.println("Amigos de "+list.get(i).getNome()+
                  "["+ list.indexOf(list.get(i)) +"]"+ ": ");
            System.out.println(rede.listarAmizades(list.get(i)));
            System.out.println("\n");
        }
           
        int origem = 0;
        BuscaLargura b = new BuscaLargura(rede);
        
        b.execute(list.get(origem));
        b.imprimir();

        System.out.println("\n");
        System.out.println("0- "+rede.ponderar(list.get(origem),list.get(0)));
        System.out.println("1- "+rede.ponderar(list.get(origem),list.get(1)));
        System.out.println("2- "+rede.ponderar(list.get(origem),list.get(2)));
        System.out.println("3- "+rede.ponderar(list.get(origem),list.get(3)));
        System.out.println("4- "+rede.ponderar(list.get(origem),list.get(4)));
        System.out.println("5- "+rede.ponderar(list.get(origem),list.get(5)));
        System.out.println("6- "+rede.ponderar(list.get(origem),list.get(6)));
        System.out.println("7- "+rede.ponderar(list.get(origem),list.get(7)));
        System.out.println("8- "+rede.ponderar(list.get(origem),list.get(8)));
        System.out.println("9- "+rede.ponderar(list.get(origem),list.get(9)));
        System.out.println("10- "+rede.ponderar(list.get(origem),list.get(11)));
        System.out.println("12- "+rede.ponderar(list.get(origem),list.get(7)));
        System.out.println("13- "+rede.ponderar(list.get(origem),list.get(6)));
        System.out.println("14- "+rede.ponderar(list.get(origem),list.get(8)));
        System.out.println("15- "+rede.ponderar(list.get(origem),list.get(11)));
        System.out.println("16- "+rede.ponderar(list.get(origem),list.get(12)));
        System.out.println("17- "+rede.ponderar(list.get(origem),list.get(12)));
        System.out.println("18- "+rede.ponderar(list.get(origem),list.get(6)));
        System.out.println("19- "+rede.ponderar(list.get(origem),list.get(4)));
        System.out.println("20- "+rede.ponderar(list.get(origem),list.get(18)));
    
   }
}
