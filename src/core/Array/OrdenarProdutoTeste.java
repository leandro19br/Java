package core.Array;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto> {


    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class OrdenarProdutoTeste {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("875","Notbook Lenovo",2000.0,0);
        Produto p2 = new Produto("123","Picanha",20.0,10);
        Produto p3 = new Produto("321","Mouse",25.0,3);
        Produto p4 = new Produto("012","Coca-Cola",7.5,5);


        /*
        Produto p1 = new Produto("1","Notbook Lenovo",2000.0);
        Produto p2 = new Produto("12","Picanha",20.0);
        Produto p3 = new Produto("3","Mouse",25.0);
        Produto p4 = new Produto("25","Coca-Cola",6.5);
        */


        //adicionando os produtos na lista

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        /*//irá dar erro de compilação pois o java não sabe por onde ordenar, se pelo nome, ou pelo preço ou pelo id
        * String implemeta Comparable por isso faz a ordenação
        * Para corrigir o erro a Classe produto foi implementada por Comparable<Produto> e implementado o método
        * compareTo ordenando pelo serialNumber*/

        Collections.sort(produtos,new ProdutoNomeComparator());

        for (Produto produto : produtos){
            System.out.println(produto);
        }

        Produto[] arrayProdutos = new Produto[4];
        arrayProdutos[0] = p1;
        arrayProdutos[1] = p2;
        arrayProdutos[2] = p3;
        arrayProdutos[3] = p4;

        Arrays.sort(arrayProdutos);

        for (Produto produto: arrayProdutos             ) {

        }

    }
}
