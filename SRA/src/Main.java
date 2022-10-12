import java.util.ArrayList;
/**
 *Classe responsável pela recomendação de pessoas
 * 
 * @author Geisianny e Rodrigo
 */
public class Main {

    public static void main(String[] args) {
        
        Repositorio repositorio = new Repositorio();
        repositorio.bancoCom25pessoas();
        
        ArrayList<Pessoa> list = repositorio.lista;
           
                    
        Rede rede = new Rede(list.size());
            
        for (Pessoa p : list){
            rede.adicionarVertice(p);
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
        rede.adicionarAresta(list.get(20),list.get(19));
        rede.adicionarAresta(list.get(22),list.get(5));
        rede.adicionarAresta(list.get(20),list.get(0));
        rede.adicionarAresta(list.get(20),list.get(22));
        rede.adicionarAresta(list.get(21),list.get(24));
        rede.adicionarAresta(list.get(23),list.get(21));
        rede.adicionarAresta(list.get(21),list.get(24));
        rede.adicionarAresta(list.get(22),list.get(4));
        rede.adicionarAresta(list.get(24),list.get(15));
        rede.adicionarAresta(list.get(23),list.get(0));
        rede.adicionarAresta(list.get(22),list.get(1));
        rede.adicionarAresta(list.get(23),list.get(24));



        Pessoa origem = list.get(0);
        View v = new View();
        v.Recomendar(origem,rede);

        rede.imprimir();



    
   }
}
