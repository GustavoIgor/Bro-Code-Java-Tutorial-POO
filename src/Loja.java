import java.util.ArrayList;

public class Loja {
    String endereco;
    String nome;
    ArrayList<Bolo> lista = new ArrayList<>();
    ArrayList<BoloRecheado> listaRecheado = new ArrayList<>();

    Loja (String endereco, String nome){
        this.endereco = endereco;
        this.nome = nome;
    }

    public String toString(){
        return this.nome + "\n" + this.endereco;
    }

}
