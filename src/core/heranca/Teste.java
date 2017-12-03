package core.heranca;

public class Teste {

    public static void main(String[] args) {
        Endereco e = new Endereco("Rua zero","ABC");
        Pessoa p = new Pessoa("Leandro","23456764",e);
        p.imprime();
        Funcionario f = new Funcionario();
        f.setNome("Miguel");
        f.setCpf("12345667");
        f.setEndereco(e);
        f.setSalario(2000);
        f.imprime();
       //não imprime salário pois o salário não faz parte de pessoa

    }

}
