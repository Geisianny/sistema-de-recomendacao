

public class View {


    public void menu(Rede rede) {



            while(true){
                System.out.println("1 - Add vertices e aresta");
                System.out.println("2 - Imprimir Grafo dado");
                System.out.println("3 - Obter arvore de Kruskal");
                System.out.println("4 - Obter caminho de Dijkstra");
                System.out.println("5 - Obter arvore de Busca em Profundidade");
                System.out.println("6 - Obter Fecho Transitivo do Grafo");
                System.out.println("7 - Obter arvore de Busca em Largura");
                System.out.println("8 - Obter Ordenacao Topologica");
                System.out.println("9 - Obter Matriz do Algoritmo de Warshall");
                System.out.println("0 - fim");

                //opcao = Keyboard.readInt();

                //dando um reset no grafo de resultado
              //  resultado.clearLists();

                //limpando verificadores booleanos
               // inicial.limparArestaVisitada();
               // inicial.limparVerticeVisitado();

             //   switch (opcao){
                 //   case 1:
                      //      rede.imprimirMapa();
                  //  case 2:
                   //     recomendar
                    //    break;

                  //  default:
                     //   System.out.println("invalido");
                      //  break;
              //  }

            }
        }

       public void Recomendar(Pessoa origem, Rede rede){

        BuscaLargura b = new BuscaLargura(rede);
           b.execute(origem);
           System.out.println("--------- Recomendações para " + origem.getNome() +" ------------\n");
           for(int i=0; i<5;i++) {
               System.out.println("| "+ b.recomendar.get(i).getNome()+" - " + ((b.recomendar.get(i).getPeso()) ) +"% de Paridade");
           }
       }

    }


