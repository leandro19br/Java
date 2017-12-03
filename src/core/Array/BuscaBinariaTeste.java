package core.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuscaBinariaTeste {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Collections.sort(numeros);

        //para utilizar a lista precisa estar ordenada resultado não será previsivel. Será retornado o indice 1
        System.out.println(Collections.binarySearch(numeros,2));
    }
}
