public class Main {
    /*
        A programação orientada a objetos:
     */
    public static void main(String[] args) {
        Bolo bolo = new Bolo("Laranja", 35.5);
        Bolo[] bolos = new Bolo[3];
        bolo.comer();

        bolos[0] = new Bolo("Chocolate", 20.99);
        bolos[1] = new Bolo("Baunilha", 19.99);
        bolos[2] = new Bolo("Limão", 23.95);



        System.out.println(bolo);
        System.out.println(Bolo.bolosfeitos);

    }
}