//Sub classe da classe Bolo, ela herda todos os
public class BoloRecheado extends Bolo{
    String recheio;

    BoloRecheado(String sabor, double preco, String recheio){
        super(sabor, preco);
        this.recheio = recheio;
    }

    public String toString(){
        return super.toString() + "\n" + this.recheio;
    }

    @Override
    public void comer(String nome){
        if (mordidas == 10){
            System.out.println("O bolo está totalmente comido!");
        } else{
            System.out.println("Nham nham!" + nome + " comeu um pedaço do bolo de " + this.sabor + " com recheio de " + this.recheio +"!");
            this.mordidas++;
        }
    }
}