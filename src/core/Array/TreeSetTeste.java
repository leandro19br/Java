package core.Array;

import core.Colecoes.Celular;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("123","Iphone",4000.0,5);
        Produto p2 = new Produto("321","Teclado",120.0,0);
        Produto p3 = new Produto("012","Galaxy Note",2500.0,10);
        Produto p4 = new Produto("456","Mouse",40.0,0);
        Produto p5 = new Produto("456","Mouse2",40.0,2);//não insere duplicado
        Produto p6 = new Produto("011","Mouse2",40.0,2);//insere em primeiro por levar em conta o serial
        Celular c1 = new Celular("Iphone 7","1234");

        //para trabalhar com TreeSet utilizamos a classe NavigableSet
        //ao inserir os elementos já são ordenados automaticamente
        //não pode ter elemento duplicado

        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        NavigableSet<Celular> celularNavigableSet = new TreeSet<>();

        produtoNavigableSet.add(p1);
        produtoNavigableSet.add(p2);
        produtoNavigableSet.add(p3);
        produtoNavigableSet.add(p4);
        produtoNavigableSet.add(p5);
        produtoNavigableSet.add(p6);

        //descendingSet - organiza a lista em ordem inversa
        for (Produto p: produtoNavigableSet.descendingSet()) {
            System.out.println(p);
        }

        /*
        Quando utila se TreeSet é obrigado utilizar objetos que implementam Comparable ou um Comparetor
        celularNavigableSet.add(c1);

        for (Celular c: celularNavigableSet) {
            System.out.println(c);
        }
        */
        System.out.println("------------Metodos------------------");
        //lower() < retorna menor produto antes do que for passado
        //floor  <= retorna menor produto antes do que for passado ou ele mesmo
        //higher() > retorna maior produto antes do que for passado
        //ceiling() >= retorna maior produto antes do que for passado ou ele mesmo

        /*
        System.out.println(produtoNavigableSet.lower(p3));
        System.out.println(produtoNavigableSet.floor(p1));
        System.out.println(produtoNavigableSet.higher(p1));
        System.out.println(produtoNavigableSet.ceiling(p1));
        */

        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollFirst());//pega o primeiro da lista e remova
        System.out.println(produtoNavigableSet.size());

        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast());//pega o ultimo da lista e remova
        System.out.println(produtoNavigableSet.size());
    }
}
