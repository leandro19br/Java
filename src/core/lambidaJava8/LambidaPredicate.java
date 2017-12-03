package core.lambidaJava8;

import core.lambidaJava8.Carro;
import core.lambidaJava8.CarroPredicate;

import java.util.function.Predicate;

/**
 * criado pra diminuir a verbosidade no código
 * é uma função e não métodos já que o método se refere a uma classe
 * Interface que tem somente um método abstrato - chamada de functional interface
 * lambida só pode ser utilizada com a interface funcional
 * Neste exemplo utilizo a Classe Predicate para fazer um teste que tem retorno true ou false
 */
public class LambidaPredicate {
    public static void main(String[] args) {
        //utilizando classe anonima

        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean teste(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };

        //utilizando Lambida

        CarroPredicate carroPredicate1 = (Carro carro) -> carro.getCor().equals("verde");

        Predicate<Carro> predicate = (Carro carro) -> carro.getCor().equals("verde");

        System.out.println(carroPredicate.teste(new Carro("verde",2008)));
        System.out.println(carroPredicate1.teste(new Carro("verde",2008)));
        System.out.println(predicate.test(new Carro("verde",2008)));

    }
}
