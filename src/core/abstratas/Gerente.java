package core.abstratas;
/**
 * toda classe que extende de uma classe abstrata é obrigada a implementar os métodos
 * As classes que herdam de Funcionario que tb herda de Pessoa tem que sobreescrever o método da classe Pessoa
 * a não ser que o metodo tenha sido sobreescrito em Funcionário
 */

public class Gerente extends Funcionario {

    public Gerente() {
    }

    @Override
    public void calculaSslario() {

        this.salario += salario *0.2;

    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void imprime() {

    }
}
