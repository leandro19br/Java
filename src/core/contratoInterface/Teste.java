package core.contratoInterface;

public class Teste {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook",4,3000);
        p.calculaFrete();
        p.calculaImposto();
        System.out.println(p);
    }
}
