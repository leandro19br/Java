package core.Array;

import core.Colecoes.Celular;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InteretorTeste {
    public static void main(String[] args) {
        List<Produto> produtos = new LinkedList<>();

        Produto p1 = new Produto("012","Galaxy Note",2500.0,10);
        Produto p2 = new Produto("123","Iphone",4000.0,5);
        Produto p3 = new Produto("321","Teclado",120.0,0);
        Produto p4 = new Produto("456","Mouse",40.0,0);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        /*
        for (Produto produto:produtos) {
            removendo os produtos que tenham quantidade = 0, porém deste modo só removeu o teclado
            if (produto.getQuantidade() == 0){
                produtos.remove(produto);
                System.out.println(produto);
            }
        }
        */

       //forma mais simples seria percorrer a lista utilizando iterator

        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasNext e next
        while (produtoIterator.hasNext()){
            Produto produto = produtoIterator.next();//vai retornar um produto que está na fila
            //verifica se este produto tem quantidade 0
            if (produto.getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());

    }
}
