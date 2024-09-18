public abstract class Pessoa {
    /*
    encapsulamento: o acesso da classe se torna privado, senso acessada por meio de um
    getter (que permite acessar uma variável) e um setter (que permite atribuir valor a uma variável)
    Isso é uma propriedade do Java que adiciona uma camada a mais de segurança.
    É recomendável que se faça isso nos projetos.
     */

    private int idade;
    private String nome;
    Pessoa(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
