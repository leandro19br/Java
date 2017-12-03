package core.Polimorfismo;

public class Teste {

    public static void main(String[] args) {

        Gerente g = new Gerente("Leandro",4000,2500);
        Vendedor v = new Vendedor("Yuri",2000,20000);

        RelatórioPagamento r = new RelatórioPagamento();

        /*
        r.pagamentoGerente(g);
        System.out.println("____________________");
        r.pagamentoVendedor(v);
        */
        //funcionário vai referenciar gerente
        Funcionario f = g;

        System.out.println("+++++++++++++++++++++++++");

        System.out.println(f.getSalario());

        //Gerando relatório com o generico
        r.pagamentoGenerico(g);
        r.pagamentoGenerico(v);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");










    }
}
