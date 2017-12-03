package core.sobrecargaMetodos.teste;

import core.sobrecargaMetodos.classes.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva","12345678-99",2500,"234567");
        Funcionario funcionario1 = new Funcionario();
        //funcionario.init("Chica da Silva","12345678-99",2500,"234567");
        funcionario.imprime();
        funcionario1.imprime();

    }
}
