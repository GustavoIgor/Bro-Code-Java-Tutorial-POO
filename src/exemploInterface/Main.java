package exemploInterface;

public class Main {
    //Interface: Obriga uma classe a utilizar uma ou mais funções
    public static void main(String[] args) {
        Coelho coelho = new Coelho();
        Falcao falcao = new Falcao();
        Peixe peixe = new Peixe();
        coelho.fugir();
        falcao.cacar();
        peixe.cacar();
        peixe.fugir();
    }
}
