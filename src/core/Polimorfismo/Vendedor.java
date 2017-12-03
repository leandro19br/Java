package core.Polimorfismo;

public class Vendedor extends Funcionario{
    private double totaldeVendas;

    public Vendedor(String nome, double salario,double totaldeVendas) {
        super(nome, salario);
        this.totaldeVendas = totaldeVendas;
    }

    public double getTotaldeVendas() {
        return totaldeVendas;
    }

    public void setTotaldeVendas(double totaldeVendas) {
        this.totaldeVendas = totaldeVendas;
    }

    @Override
    public void calcularPagamento() {

        this.salario += totaldeVendas * 0.05;

    }
}
