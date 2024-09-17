import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
        A programação orientada a objetos:
     */
    public static void main(String[] args) {
        String nomeusu, nome, endereco, sabor, recheio;
        int i, escolha, escolha2, num1, num2, idade;
        double preco;
        Loja lojautilizada = null;
        ArrayList<Loja> listaLojas = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        /*
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
         */

        System.out.println("Bom dia, insira seu nome: ");
        nomeusu = scanner.nextLine();
        while (lojautilizada == null){
            System.out.println("Olá, "+ nomeusu + ". O que deseja fazer? Insira: \n" +
                    "1 - Para ver as lojas disponíveis" +
                    "2 - Para adicionar uma loja\n" +
                    "3 - Para excluir uma loja\n" +
                    "4 - atualizar uma loja\n" +
                    "5 - escolher uma loja");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    for (i = 0; i < listaLojas.size(); i++){
                        System.out.println(listaLojas.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome da loja: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o endereço da loja: ");
                    endereco = scanner.nextLine();
                    listaLojas.add(new Loja(endereco, nome));
                    break;
                case 3:
                    System.out.println("Insira qual posição do item que queres excluir: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("O item que queres deletar é o/a: " + listaLojas.get(num1) + ". Tem certeza disso? 1 - Sim | 2 - Não ");
                    escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha2 == 1){
                        listaLojas.remove(num1);
                    }
                    break;
                case 4:
                    System.out.println("Insira qual posição queres mudar: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Quer mudar o nome (digite 1) ou o endereço (digite 2)?");
                    escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    scanner.nextLine();
                    if (escolha2 == 1){
                        System.out.println("Insira o novo nome: ");
                        nome = scanner.nextLine();
                        listaLojas.get(num1).nome = nome;
                    }else{
                        System.out.println("Insira o novo endereço: ");
                        endereco = scanner.nextLine();
                        listaLojas.get(num1).endereco = endereco;
                    }

                    break;
                case 5:
                    System.out.println("Qual posição da loja queres escolher?");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    lojautilizada = listaLojas.get(num1);
            }
        }
        escolha = 1;
        while (escolha != -1){
            switch (escolha) {
                case 1:
                    System.out.println("Você está administrando a loja " + lojautilizada.nome + ", ela fica no endereço " + lojautilizada.endereco + ".\n" +
                            "Digite: \n" +
                            "1 - continuar no menu\n" +
                            "2 - Fazer um bolo\n" +
                            "3 - Cadastrar um cliente\n" +
                            "4 - Mostrar os bolos\n" +
                            "5 - mostrar bolo específico\n" +
                            "6 - Mostrar os clientes\n" +
                            "7 - Mostrar cliente específico\n" +
                            "8 - Atender cliente\n" +
                            "-1 - sair");
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("é um bolo normal (digite 1) ou recheado (digite 2)?");
                    escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira o sabor: ");
                    sabor = scanner.nextLine();
                    System.out.println("Insira o preço: ");
                    preco = scanner.nextDouble();
                    //scanner.nextLine();
                    if (escolha2 == 1){
                        lojautilizada.lista.add(new Bolo(sabor, preco));
                    }else {
                        System.out.println("Insira o recheio: ");
                        recheio = scanner.nextLine();
                        lojautilizada.listaRecheado.add(new BoloRecheado(sabor, preco, recheio));
                    }
                    escolha = 1;
                    break;
                case 3:
                    System.out.println("Insira o nome do cliente: ");
                    nome = scanner.nextLine();
                    System.out.println("Insira a idade do cliente: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    clientes.add(new Cliente(nome, idade));
                    escolha = 1;
                    break;
                case 4:
                    System.out.println("O número total de bolos feitos é " + Bolo.bolosfeitos + ".");
                    System.out.println("Os bolos normais são: \n");
                    for (i = 0; i < lojautilizada.lista.size(); i++){
                        System.out.println(lojautilizada.lista.get(i));
                    }
                    System.out.println("Os bolos recheados são: \n");
                    for (i = 0; i < lojautilizada.listaRecheado.size(); i++){
                        System.out.println(lojautilizada.listaRecheado.get(i));
                    }
                    escolha = 1;
                    break;
                case 5:
                    System.out.println("Você deseja ver um bolo normal (digite 1) ou recheado (digite 2)?");
                    escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira a posição do bolo desejado: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    if(escolha2 == 1){
                        System.out.println(lojautilizada.lista.get(num1));
                    }else{
                        System.out.println(lojautilizada.listaRecheado.get(num1));
                    }
                    escolha = 1;
                    break;
                case 6:
                    for (i = 0; i < clientes.size(); i++){
                        System.out.println(clientes.get(i));
                    }
                    escolha = 1;
                    break;
                case 7:
                    System.out.println("Insira a posição do Cliente desejado: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(clientes.get(num1));
                    escolha = 1;
                    break;
                case 8:
                    if(clientes.isEmpty() || (lojautilizada.lista.isEmpty() && lojautilizada.listaRecheado.isEmpty())){
                        System.out.println("Você não tem bolos ou/e clientes na loja!");
                        escolha = 1;
                        break;
                    }
                    System.out.println("Insira o número da posição do cliente: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Cliente número " + clientes.get(num1).getNumerocliente() + ", faça seu pedido");
                    System.out.println("O cliente pediu um bolo normal (digite 1) ou recheado (digite 2)?");
                    escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira a posição do bolo: ");
                    num2 = scanner.nextInt();
                    scanner.nextLine();
                    if(escolha2 == 1){
                        lojautilizada.lista.get(num2).comer(clientes.get(num1).getNome());
                    }else{
                        lojautilizada.listaRecheado.get(num2).comer(clientes.get(num1).getNome());

                    }
                    escolha = 1;
                    break;
                default:
                    System.out.println("Você inseriu um número inválido!");
                    escolha = 1;
                    break;
            }
        }

        
    }
}