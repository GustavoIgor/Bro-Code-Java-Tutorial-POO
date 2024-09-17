package package1;
import package2.*;
public class A {
    protected String mensagemProtegida = "Esta é uma mensagem protegida.";
    public static void main(String[] args) {
        C c = new C();
        //B b = new B();
        //System.out.println(c.defaultMessage);
        //System.out.println(b.mensagemPrivada);
        /*
        As variáveis ou classes com o modificador de acesso 'public' são visíveis por qualquer classe.
         */
        System.out.println(c.mensagemPublica);
    }
}
