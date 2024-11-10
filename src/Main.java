public class Main {
    public static void main(String[] args) {
        Pessoa pf = new PessoaFisica("JORGE", "AV TAL DO TALDO 1111", 20, "999.999.999-99", "12/12/2012");
        Pessoa pj = new PessoaJuridica("DAVI", "RUA ERNESTO DAKU 188", 19, "11.111.111/0001-11", "DAVI FLAMENGO");

        pf.imprimirInfo();
        System.out.println();
        pj.imprimirInfo();
    }
}