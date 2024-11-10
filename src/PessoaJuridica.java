public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String endereco, int idade, String cnpj, String nomeFantasia) {
        super(nome, endereco, idade);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void imprimirInfo() {
        System.out.println("****** PESSOA JURIDICA ******");
        System.out.println("RAZÃO SOCIAL: " + nome);
        System.out.println("NOME FANTASIA: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("ENDEREÇO: " + endereco);
        System.out.println("IDADE: " + idade);
    }
}
