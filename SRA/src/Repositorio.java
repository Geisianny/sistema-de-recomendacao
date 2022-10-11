import java.util.ArrayList;

public class Repositorio {
    ArrayList<Pessoa> lista;


    public Repositorio(){
        this.lista=new ArrayList<Pessoa>();

        Pessoa pessoa0 = new Pessoa("Cathleen Diniz", 26, "Masculino", "Santos", "/series", "Terror", "Humanas");
        Pessoa pessoa1 = new Pessoa( "Byron Chaves", 37, "Masculino", "Sao Paulo", "Ler livros", "Cómedia", "Exatas");
        Pessoa pessoa2 = new Pessoa( "Isabelle de Barros", 49, "Feminino", "Corinthians", "Academia", "Ação", "Biologicas");
        Pessoa pessoa3 = new Pessoa( "Zeph Gomes", 47, "Feminino", "Palmeiras", "Praticar esportes", "Romance", "Outras");
        Pessoa pessoa4 = new Pessoa( "Germane Henrique", 25, "Masculino", "Flamengo","Jogar Games", "Aventura", "Humanas");
        Pessoa pessoa5 = new Pessoa( "Maxwell Firmino", 28, "Masculino", "Fluminense", "Outras", "Terror", "Exatas");
        Pessoa pessoa6 = new Pessoa( "Victor Antunes", 29, "Feminino", "Botafogo", "Assistir Filmes/series", "Cómedia", "Biologicas");
        Pessoa pessoa7 = new Pessoa( "Bethany Rezende", 24, "Feminino", "Vasco", "Ler livros", "Ação", "Outras");
        Pessoa pessoa8 = new Pessoa( "Constance de Morais", 40, "Masculino", "Gremio", "Academia", "Romance", "Humanas");
        Pessoa pessoa9 = new Pessoa( "Wynne Correa", 27, "Masculino", "Internacional", "Praticar esportes", "Aventura", "Exatas");

        lista.add(pessoa0);
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);
        lista.add(pessoa4);
        lista.add(pessoa5);
        lista.add(pessoa6);
        lista.add(pessoa7);
        lista.add(pessoa8);
        lista.add(pessoa9);

    }
}
