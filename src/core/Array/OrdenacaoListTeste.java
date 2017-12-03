package core.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoListTeste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Leandro");
        nomes.add("Gustavo");
        nomes.add("Erica");
        nomes.add("Miguel");
        nomes.add(0,"Anna");//adicionando Anna na posição 0
        Collections.sort(nomes);//ordena a lista em ordem alfabética
        for (String nome:nomes) {
            System.out.println(nome);
        }

        List<Double> numeros = new ArrayList<>();
        numeros.add(10.0);
        numeros.add(20.0);
        numeros.add(5.0);
        numeros.add(1.0);
        Collections.sort(numeros);//ordenando os numeros
        for (Double numero:numeros) {
            System.out.println(numero);
        }
    }
}
