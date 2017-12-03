package core.Polimorfismo;

import com.sun.org.apache.xpath.internal.SourceTree;

public class RelatórioPagamento {
/*
    public void pagamentoGerente(Gerente gerente) {
        System.out.println("Gerando Relatório de Pagamento de Gerente");

        gerente.calcularPagamento();

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário do Mês: " + gerente.getSalario());

    }

    public void pagamentoVendedor(Vendedor vendedor) {
        System.out.println("Gerando Relatório de Pagamento de Vendedores");

        vendedor.calcularPagamento();

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário do Mês: " + vendedor.getSalario());

    }
    */

    public void pagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando Relatório de Pagamento");

        funcionario.calcularPagamento();

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário do Mês: " + funcionario.getSalario());
        //para acessar pnl que é um atributo exclusivo de gerente é necesário fazer um cast explicito
        //utilizando instanceof para tratar o erro se vier um vendedor

        if (funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação nos Lucros: " + g.getPnl());
        }else if (funcionario instanceof Vendedor){

            System.out.println("Total de Vendas: " + ((Vendedor) funcionario).getTotaldeVendas());
        }

    }
}