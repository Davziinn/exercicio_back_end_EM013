public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String endereco, int idade, String cpf, String dataNascimento) {
        super(nome, endereco, idade);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void imprimirInfo() {
        System.out.println("****** PESSOA FÍSICA ******");
        System.out.println("NOME: " + nome);
        System.out.println("ENDERECO: " + endereco);
        System.out.println("IDADE: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("DATA NASCIMENTO: " + dataNascimento);
    }
}
