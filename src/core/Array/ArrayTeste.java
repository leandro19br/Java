package core.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTeste {
    public static void main(String[] args) {

        //Utilizando a interface List como variável de instancia e uma classe concreta ArrayList
        //não podemos fazer ArrayList de tipos primitivos

        List nomes = new ArrayList();

        nomes.add("Leandro");
        nomes.add("Gustavo");
        nomes.add("Erica");
        nomes.remove(0);//removendo passando o index
        nomes.clear();
        System.out.println("----------após versão 7 do java-------------");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Leandro");
        nomes2.add("Miguel");
        //pode ser feito desta forma
        for (int i = 0 ; i < nomes2.size() ; i++){
            System.out.println(nomes2.get(i));
        }

        for (String nome: nomes2) {
            System.out.println(nome);
        }

        System.out.println("------------adicionando a lista dentro da outra----------");

        nomes.addAll(nomes2);

        for (Object nome: nomes) {
            System.out.println(nome);
        }

    }
}
