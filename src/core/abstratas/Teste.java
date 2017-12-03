package core.abstratas;

public class Teste {
    public static void main(String[] args) {



        Gerente g = new Gerente("Ana","12-2012",2000);
        g.calculaSslario();
        System.out.println(g);

        Vendedor v = new Vendedor("Camila","12-2005",1000,1000);
        v.calculaSslario();
        System.out.println(v);

    }
}
