package core.heranca;

public class Funcionario extends Pessoa {

    private double salario;

    //sobreescrita de método a assinatura e parâmetros tem que ser igual
    public void imprime(){
        super.imprime();//para acesar o método utilza se a palavra super
        System.out.println("Salário" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
