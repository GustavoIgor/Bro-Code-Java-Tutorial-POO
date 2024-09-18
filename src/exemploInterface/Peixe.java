package exemploInterface;
//Pode-se ter mais de uma interface em uma classe.
public class Peixe implements Predador, Presa{
    @Override
    public void cacar() {
        System.out.println("Esta peixe is caçando um peixe menor.");
    }

    @Override
    public void fugir() {
        System.out.println("Este peixe está fugindo de um peixe maior.");
    }
}
