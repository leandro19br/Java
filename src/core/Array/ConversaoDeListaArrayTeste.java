package core.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListaArrayTeste {

    public static void main(String[] args) {
        //convertendo List em Arrays
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Integer[] numerosArray = new Integer[numeros.size()];
        //Object[] objects = numeros.toArray();//se não passar um arg ele retorna uma lista de obj ou
        numeros.toArray(numerosArray);
        System.out.println(numeros);
        System.out.println(Arrays.toString(numerosArray));

        //convertendo Arrays em List

        System.out.println("--------------------------------------------------");
        Integer[] numerosArray2 = new Integer[4];

        numerosArray2[0] = 10;
        numerosArray2[1] = 9;
        numerosArray2[2] = 8;
        numerosArray2[3] = 7;
        List<Integer> numeros2 = Arrays.asList(numerosArray2);
        //adicionando um novo numero a lista sem afetar o Array

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.addAll(Arrays.asList(numerosArray2));
        numeros2.set(0,1);
        numeros3.add(10);

        System.out.println("Array " + Arrays.toString(numerosArray2));
        System.out.println("Lista 2 " + numeros2);
        System.out.println("Lita 3 " + numeros3);





    }
}
