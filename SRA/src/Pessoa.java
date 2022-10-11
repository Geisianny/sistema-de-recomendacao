
import java.util.ArrayList;

/**Classe responsavel pela objetificação de pessoa para o sistema.
 *
 * @author VAIO
 */
public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;
    private int idade;
    private int Id;
    private String sexo;
    private ArrayList interesses = new ArrayList<String>(); //<hobby, genero, formacao>;
    private String time;

    private int peso;

    public Pessoa() {

    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, String sexo, String time, String hobby, String generoFilme, String formação) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
        this.sexo = sexo;
        interesses.add(hobby);
        interesses.add(generoFilme);
        interesses.add(formação);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList getInteresses() {
        return interesses;
    }

    public void setInteresses(String hobby, String genero, String formação) {
        this.interesses.add(hobby);
        this.interesses.add(genero);
        this.interesses.add(formação);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", Id=" + 
                Id + ", sexo=" + sexo +  '}';
    }


    @Override
    public int compareTo(Pessoa p) {

        if(this.getPeso() > p.getPeso())
            return -1;
        else if(this.peso == p.getPeso())
            return 0;

        return 1;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

