public class Bolo {
    //Variáveis do Bolo
    String sabor;
    double preco;
    boolean vendido;
    int mordidas = 0;
    //Modificador estático (static): Esta variável pertence à classe, todos os objetos tem esta mesma variável
    //de forma estática, diferentemente das mordidas, que pertencem ao objeto.
    static int bolosfeitos;

    //Contrutor
    Bolo(String sabor, double preco){
        this.sabor = sabor;
        this.preco = preco;
        this.vendido = false;
        bolosfeitos++;
    }
    //Overload do construtor
    Bolo(String sabor, double preco, boolean vendido){
        this.sabor = sabor;
        this.preco = preco;
        this.vendido = vendido;
        bolosfeitos++;
    }
    //Função de comer, cada vez que é utilizada aumenta um numero de mordidas da classe,
    //se chegar a 10 mordidas, o bolo é comido.
    public void comer(String nome){
        if (mordidas == 10){
            System.out.println("O bolo está totalmente comido!");
        } else{
            System.out.println("Nham nham! " + nome + " comeu um pedaço do bolo de " + this.sabor + "!");
            this.mordidas++;
        }
    }
    //overload na função toString
    public String toString(){
        return this.sabor + "\n" + this.preco + "\n" + this.vendido + "\n" + this.mordidas;
    }
}
