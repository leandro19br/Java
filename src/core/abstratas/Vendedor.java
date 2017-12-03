package core.abstratas;


public class Vendedor extends Funcionario {

    private double vendas;

    public Vendedor(String nome, String clt, double salario, double vendas) {
        super(nome, clt, salario);
        this.vendas = vendas;
    }

    public Vendedor(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public void calculaSslario() {

        this.salario += vendas * 0.05;

    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public void imprime() {

    }
}
