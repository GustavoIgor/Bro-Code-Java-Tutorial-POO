public class Cliente extends Pessoa{
    int numerocliente;
    static int numero;

    Cliente(String nome, int idade) {
        super(nome, idade);
        numero++;
        this.numerocliente = numero;
    }

}
