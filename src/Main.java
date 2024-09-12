public class Main {
    /*
        A programação orientada a objetos:
     */
    public static void main(String[] args) {
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

    }
}