package core.Array;

import core.Colecoes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListaCelularTeste {

    public static void main(String[] args) {
        Celular c1 = new Celular("Iphone","1234");
        Celular c2 = new Celular("Moto G5","1234987");
        Celular c3 = new Celular("Sansung S7","14987");
        Celular c4 = new Celular("Sansung S8","12387");

        List<Celular> celulares = new ArrayList<>();
        celulares.add(c1);
        celulares.add(c2);
        celulares.add(c3);
        celulares.add(c4);


        for (Celular celular: celulares) {
            System.out.println(celular);
            //System.out.println("");
            System.out.println(celular.getNome() + celular.getImei());
        }

        Celular c5 = new Celular("Iphone","1234");
        //verificar se o C5 já existe dentro da lista
        boolean tem = celulares.contains(c5);
        System.out.println(tem);//retorno será true

    }
}
