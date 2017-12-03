package core.generics;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {

        criarArray(new Cachorro());
        //retorna uma lista de cachorro
        List<Cachorro> cachorroList = criarArrayRetorno(new Cachorro());
        System.out.println(cachorroList);

    }
    //método genérico criando um array de T
    public static <T> void criarArray(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
    //criando lista que retorna uma lista de T
    public static <T> List<T> criarArrayRetorno(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }
}
