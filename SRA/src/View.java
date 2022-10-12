
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    public void menu(Rede rede) {
        
        Scanner scan = new Scanner(System.in);
        
        Boolean continuar = true;
        
        while(continuar){
            System.out.println("\n1 - Imprimir o mapa");
            System.out.println("2 - Imprimir matriz");
            System.out.println("3 - recomendar novos amigos");
            System.out.println("4 - listar amigos");
            System.out.println("0 - Sair");

            int opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("");
                    rede.imprimirMapa();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("\n");
                    rede.imprimir();
                    System.out.println("\n");
                    break;
                case 3: 
                    System.out.println("\nDigite o index da pessoa: ");
                    int index = scan.nextInt();
                    
                    Pessoa pessoa = new Pessoa();
                    
                    List<Pessoa> pessoas = new ArrayList<>(); 
                    pessoas = rede.getMapa();
                    
                    pessoa = pessoas.get(index);
                    Recomendar(pessoa,rede);
                    
                    break;
                
                case 4:
                    System.out.println("");
                    Repositorio repositorio = new Repositorio();
                    repositorio.bancoCom30pessoas();
        
                    ArrayList<Pessoa> list = repositorio.lista;
                    
                    for (int i=0;i< list.size();i++){
                        System.out.println("Amigos de "+list.get(i).getNome()+
                        "["+ list.indexOf(list.get(i)) +"]"+ ": ");
                        System.out.println(rede.listarAmizades(list.get(i)));
                        System.out.println("\n");
                    }
                    
                case 0: 
                    System.out.println("\nSaindo...");
                    continuar = false;
                    break;
                    
                default:
                    
                     System.out.println("\ninvalido");
                     break;

            }
        }
    }
      
    
    public void Recomendar(Pessoa origem, Rede rede){

        BuscaLargura b = new BuscaLargura(rede);
           b.execute(origem);
           System.out.println("--------- Recomendações para " + origem.getNome()
                   +" ------------\n");
           for(int i=0; i<5;i++) {
               System.out.println("| "+ b.recomendar.get(i).getNome()+" - " 
                       + ((b.recomendar.get(i).getPeso()) ) +"% de Paridade");
           }
       }

    }


