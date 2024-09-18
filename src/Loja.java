import java.util.ArrayList;

public class Loja {
    String endereco;
    String nome;
    //Por meio do polimorfismo é possível utilizar um ArrayList do tipo 'Bolo'
    //tanto para bolos quanto para bolos recheados
    ArrayList<Bolo> lista = new ArrayList<>();
    //Não mais necessário: ArrayList<BoloRecheado> listaRecheado = new ArrayList<>();

    Loja (String endereco, String nome){
        this.endereco = endereco;
        this.nome = nome;
    }

    public String toString(){
        return this.nome + "\n" + this.endereco;
    }

}
