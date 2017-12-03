package core.Array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("123","Iphone",4000.0,5);
        Produto p2 = new Produto("321","Teclado",120.0,0);
        Produto p3 = new Produto("012","Galaxy Note",2500.0,10);
        Produto p4 = new Produto("456","Mouse",40.0,0);
        Produto p5 = new Produto("456","Mouse2",40.0,2);
        //item não será inserido por ter o mesmo codigo pois utiliza os métodos equals e hashCode

        /*Diferenças do Set para o List
        * Set - não permite elementos duplicados
        * Set não é indexinado
        * na inserção não existe uma ordem*/
        Set<Produto> produtoSet = new HashSet<>();
        Set<Produto> produtoLinke = new LinkedHashSet<>();//mantem a ordem de inserção
        produtoLinke.add(p1);
        produtoLinke.add(p2);
        produtoLinke.add(p3);
        produtoLinke.add(p4);


        for (Produto p: produtoLinke) {
            System.out.println(p);
        }
    }
}
