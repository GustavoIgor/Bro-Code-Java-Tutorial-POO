public class Cliente extends Pessoa{
    private int numerocliente;
    private static int numero;

    Cliente(String nome, int idade) {
        super(nome, idade);
        numero++;
        setNumerocliente(numero);
    }

    public int getNumerocliente() {
        return numerocliente;
    }

    public void setNumerocliente(int numerocliente) {
        this.numerocliente = numerocliente;
    }


}
