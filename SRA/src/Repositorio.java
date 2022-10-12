import java.util.ArrayList;

public class Repositorio {
    
    ArrayList<Pessoa> lista;

    
    public Repositorio(){
        
        this.lista=new ArrayList<Pessoa>();
    }

    public void bancoCom10Pessoas(){
        //Inicializando o repositorio com o banco de dados de 10 pessoas
        //this.lista=new ArrayList<Pessoa>();

        Pessoa pessoa0 = new Pessoa("Cathleen Diniz", 26, "Masculino", "Santos",
                "/series", "Terror", "Humanas");
        Pessoa pessoa1 = new Pessoa( "Byron Chaves",37, "Masculino","Sao Paulo",
                "Ler livros", "Cómedia", "Exatas");
        Pessoa pessoa2 = new Pessoa( "Isabelle de Barros", 49, "Feminino", 
                "Corinthians", "Academia", "Ação", "Biologicas");
        Pessoa pessoa3 = new Pessoa( "Zeph Gomes", 47, "Feminino", "Palmeiras",
                "Praticar esportes", "Romance", "Outras");
        Pessoa pessoa4 = new Pessoa( "Germane Henrique", 25, "Masculino", 
                "Flamengo","Jogar Games", "Aventura", "Humanas");
        Pessoa pessoa5 = new Pessoa( "Maxwell Firmino", 28, "Masculino", 
                "Fluminense", "Outras", "Terror", "Exatas");
        Pessoa pessoa6 = new Pessoa( "Victor Antunes", 29, "Feminino", 
                "Botafogo", "Assistir Filmes/series", "Cómedia", "Biologicas");
        Pessoa pessoa7 = new Pessoa( "Bethany Rezende", 24, "Feminino", "Vasco",
                "Ler livros", "Ação", "Outras");
        Pessoa pessoa8 = new Pessoa( "Constance de Morais", 40, "Masculino",
                "Gremio", "Academia", "Romance", "Humanas");
        Pessoa pessoa9 = new Pessoa( "Wynne Correa", 27, "Masculino", 
                "Internacional", "Praticar esportes", "Aventura", "Exatas");

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
    
    public void bancoCom30pessoas(){
        
        this.lista.add( new Pessoa ("Brenda Candido",54,"Masculino","Santos",
                "Assistir Filmes/series","Terror","Humanas"));
        this.lista.add( new Pessoa ("Carly Maia",23,"Masculino","Sao Paulo",
                "Ler livros","Cómedia","Exatas"));
        this.lista.add( new Pessoa ("Xena Barbosa",45,"Feminino","Corinthians",
                "Academia","Ação","Biologicas"));
        this.lista.add( new Pessoa ("Meredith Soares",23,"Feminino","Palmeiras",
                "Praticar esportes","Romance","Outras"));
        this.lista.add( new Pessoa ("Emi Silveira",32,"Masculino","Flamengo",
                "Jogar Games","Aventura","Humanas"));
        this.lista.add( new Pessoa ("Daniel de Abreu",54,"Masculino","Fluminense"
                ,"Outras","Terror","Exatas"));
        this.lista.add( new Pessoa ("Brennan de Brito",48,"Feminino","Botafogo",
                "Assistir Filmes/series","Cómedia","Biologicas"));
        this.lista.add( new Pessoa ("Giacomo Candido",18,"Feminino","Vasco",
                  "Ler livros","Ação","Outras"));
        this.lista.add( new Pessoa ("Iona de Santana",54,"Masculino","Gremio"
                   ,"Academia","Romance","Humanas"));
        this.lista.add( new Pessoa ("Wallace Aguiar",53,"Masculino",
                    "Internacional","Praticar esportes","Aventura","Exatas"));
        
        this.lista.add( new Pessoa ("Ocean de Moura",52,"Feminino","Cruzeiro",
                "Jogar Games","Terror","Biologicas"));
        this.lista.add( new Pessoa ("Gemma Farias",53,"Feminino","Atletico Mineiro",
                "Outras","Cómedia","Outras"));
        this.lista.add( new Pessoa ("Mara Duarte",27,"Masculino","Santos",
                "Assistir Filmes/series","Ação","Humanas"));
        this.lista.add( new Pessoa ("Olympia Maia",34,"Masculino","Sao Paulo",
                "Ler livros","Romance","Exatas"));
        this.lista.add( new Pessoa ("Ila Marinho",40,"Feminino","Corinthians",
                "Academia","Aventura","Biologicas"));
        this.lista.add( new Pessoa ("Orlando Gonçalves",56,"Feminino","Palmeiras"
                ,"Praticar esportes","Terror","Outras"));
        this.lista.add( new Pessoa ("Amena Tavares",49,"Masculino","Flamengo",
                "Jogar Games","Cómedia","Humanas"));
        this.lista.add( new Pessoa ("Craig da Cruz",20,"Masculino","Fluminense",
                "Outras","Ação","Exatas"));
        this.lista.add( new Pessoa ("Aurora Diniz",37,"Feminino","Botafogo",
                "Assistir Filmes/series","Romance","Biologicas")); 
        this.lista.add( new Pessoa( "Jordan Vieira",24,"Feminino","Vasco",
                "Ler livros","Aventura","Outras"));
        
        this.lista.add( new Pessoa ("Jermaine Lima",47,"Masculino","Gremio",
                "Academia","Terror","Humanas"));
        this.lista.add( new Pessoa ("Brent Nogueira",43,"Masculino","Internacional"
                ,"Praticar esportes","Cómedia","Exatas"));
        this.lista.add( new Pessoa ("Prescott Guimaraes",47,"Feminino","Cruzeiro"
                ,"Jogar Games","Ação","Biologicas"));
        this.lista.add( new Pessoa ("Carter Bispo",52,"Feminino","Atletico Mineiro"
                ,"Outras","Romance","Outras"));
        this.lista.add( new Pessoa ("Upton Correia",39,"Masculino","Santos",
                "Assistir Filmes/series","Aventura","Humanas")); 
        this.lista.add( new Pessoa ("Eleanor Braz",54,"Masculino","Santos",
                "Assistir Filmes/series","Terror","Humanas"));
        this.lista.add( new Pessoa ("Nicholas Messias",42,"Masculino","Sao Paulo"
                ,"Ler livros","Cómedia","Exatas"));
        this.lista.add( new Pessoa ("Sacha de Moura",33,"Feminino","Corinthians",
                "Academia","Ação","Biologicas"));
        this.lista.add( new Pessoa ("Aiko Aguiar",57,"Feminino","Palmeiras",
                "Praticar esportes","Romance","Outras"));
        this.lista.add( new Pessoa ("Sigourney Das Chagas",53,"Masculino",
                "Flamengo","Jogar Games","Aventura","Humanas"));
            
           
           
           
        
        
        
        
        
    }
}
