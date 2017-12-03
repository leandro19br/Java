package core.abstratas;

/**
 * O objetivo de uma classe abstrata é ser extendida e não poderá ser estanciada.
 * Uma classe abstrata pode ter metodos abstratos e não abstratos. Se tiver somente um método abstrto, toda a clase
 * deverá ser abstrata.
 * A classe abstrata pode herdar de outra classe abstrata
 *
 */
public abstract class Funcionario extends Pessoa {

    protected String clt;
    protected double salario;

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    //calculo do salário
    public abstract void calculaSslario();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
