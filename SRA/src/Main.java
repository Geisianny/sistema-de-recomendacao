import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Classe responsável pela recomendação de pessoas
 * 
 * @author VAIO
 */
public class Main {

    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();

            ArrayList<Pessoa> list = repositorio.lista;

            Rede rede = new Rede(list.size());
            
            // Pessoa p1 = new Pessoa("rodrigo",17, "santos", "M", "musculação","romance","medio");
            //  Pessoa p2 = new Pessoa("lucas",34, "palmeiras", "F","pintura","romance","superior");
            
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
            rede.adicionarAresta(list.get(0),list.get(2));
            
            rede.imprimirMapa();
            
            
            System.out.println("\n");
            rede.imprimir();
            System.out.println("\n");
            
            for (int i=0;i< list.size();i++){
            System.out.println("Amigos de "+list.get(i).getNome()+"["+ list.indexOf(list.get(i)) +"]"+ ": ");
            System.out.println(rede.listarAmizades(list.get(i)));
            System.out.println("\n");
            }
            
            BuscaLargura b = new BuscaLargura(rede);
            b.execute(list.get(0));
            b.imprimir();

        System.out.println("\n");
        System.out.println("0- "+rede.ponderar(list.get(0),list.get(0)));
        System.out.println("1- "+rede.ponderar(list.get(0),list.get(1)));
        System.out.println("2- "+rede.ponderar(list.get(0),list.get(2)));
        System.out.println("3- "+rede.ponderar(list.get(0),list.get(3)));
        System.out.println("4- "+rede.ponderar(list.get(0),list.get(4)));
        System.out.println("5- "+rede.ponderar(list.get(0),list.get(5)));
        System.out.println("6- "+rede.ponderar(list.get(0),list.get(6)));
        System.out.println("7- "+rede.ponderar(list.get(0),list.get(7)));
        System.out.println("8- "+rede.ponderar(list.get(0),list.get(8)));
        System.out.println("9- "+rede.ponderar(list.get(0),list.get(9)));
    }

    
}
