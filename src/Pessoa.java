public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected int idade;

    public Pessoa(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public abstract void imprimirInfo();
}
