package package2;
import package1.*;

public class Asub extends A{
    public static void main(String[] args) {
        C c = new C();
        /*
        O modificador de acesso padrão (default) torna a variável ou classe visiveis apenas para classes
        do mesmo pacote
         */
        System.out.println(c.defaultMessage);
        Asub asub = new Asub();
        /*
        Uma variável ou classe com o modificador de acesso 'protected' pode ser vista em qualquer classe
        desde que ela seja uma subclasse. No exemplo, Asub é uma sub classe da classe A, por isso,
        pode acessar o a variável sem problemas
        */
        System.out.println(asub.mensagemProtegida);
    }
}
