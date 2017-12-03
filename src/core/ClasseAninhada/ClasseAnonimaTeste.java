package core.ClasseAninhada;

import core.generics.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Classe anonima = sobreescrever o método sem preciar criar uma classe para isso.
 */
class Animal{

    public void andar(){

        System.out.println("Animal Andando");
    }

}
public class ClasseAnonimaTeste {


    public static void main(String[] args) {

        Animal a = new Animal(){
            //criando uma classe anônima sobescrevendo o método, será usado somente neste momento do código
            public void andar(){
                System.out.println("Andando Anonimamente");
            }
        };
        a.andar();

        List<Carro> carroList = new ArrayList<>();

        carroList.add(new Carro("Ferrari"));
        carroList.add(new Carro("Lamborguini"));
        //ordenar os carros pelo nome
        Collections.sort(carroList, new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(carroList);
    }
}

/*
utilizando a classe anonima Comparetor dentro do collection como se fosse essa classe que vai ser usada somente uma vez
ou apertar alt + enter e mudar para Lambida do java 8
 Collections.sort(carroList, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
class CarroComparator implements Comparator<Carro>{


    @Override
    public int compare(Carro o1, Carro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}*/