import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
        A programação orientada a objetos:
     */
    public static void main(String[] args) {
        String nome;
        int escolha = 1;
        Loja lojautilizada = null;
        ArrayList<Loja> listaLojas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Bolo bolo = new Bolo("Laranja", 35.5);
        Bolo[] bolos = new Bolo[3];
        BoloRecheado bolorecheado = new BoloRecheado("Chocolate", 45.75,"Baunilha");

        bolos[0] = new Bolo("Chocolate", 20.99);
        bolos[1] = new Bolo("Baunilha", 19.99);
        bolos[2] = new Bolo("Limão", 23.95);

        bolo.comer("Yasmin");
        System.out.println(bolo);
        bolorecheado.comer("George");
        System.out.println(bolorecheado);
        System.out.println(Bolo.bolosfeitos);

        System.out.println("Bom dia, insira seu nome: ");
        nome = scanner.nextLine();
        while (lojautilizada == null){
            System.out.println("O que deseja fazer? Insira: \n" +
                    "1 - Para ver as lojas disponíveis" +
                    "2 - Para adicionar uma loja\n" +
                    "3 - Para excluir uma loja\n" +
                    "4 - atualizar uma loja\n" +
                    "5 - escolher uma loja");


        }

        switch (escolha){
            case 1:
                System.out.println("");
        }
    }
}