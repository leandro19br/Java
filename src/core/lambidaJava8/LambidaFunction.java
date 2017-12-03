package core.lambidaJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

/**
 * Interface Function que tem um método abstrato applay
 */
public class LambidaFunction {
    public static void main(String[] args) {

        //utilizando o método map para saber o tamanho dos arrays e colocando em uma variável List pois o método tem retorno
        //no parâmetro do Function coloco o tipo dos elelemtos do array e depois o length para retornar o tamanho

        List<Integer> tamanhoArray = map(asList("Leandro","Miguel","Gustavo"),(String s) -> s.length());
        System.out.println(tamanhoArray);

        //imprimindo a lista de cores dos carros
        List<Carro> carros = asList(new Carro("preto",2011),new Carro("verde",2001),
                new Carro("branco",2011));
        List<String> listaCores = map(carros,(Carro c) -> c.getCor());
        //pode ser feito tb desta forma
        List<String> listaCores1 = map(asList(new Carro("preto",2011),new Carro("verde",2001),
                new Carro("branco",2011)),(Carro c) -> c.getCor());
        System.out.println(listaCores);
        System.out.println(listaCores1);
        Predicate<Integer> pares = (Integer i ) -> i % 2 == 0;
        System.out.println(pares.test(10000));
        //para usar tipos primitivos + alta performance
        IntPredicate impares = (int i) -> i % 2 ==1;
        System.out.println(impares.test(10000));
        //utilizando Supplier interface que tem um metodo get que retorna algo
        Supplier<String> supplier = () -> "oi";
        System.out.println(supplier.get());
        Supplier<Carro> supplier1 = () -> new Carro("cinza",2017);
        System.out.println(supplier1.get().getCor());


    }
    //método que tem um Tipo T e retorna um Tipo R de uma lista
    public static <T,R> List<R> map(List<T> list , Function<T,R> function){
        //lista que vai guargar o resultado do forEach
        List<R> result = new ArrayList<>();
        for (T e: list) {
            result.add(function.apply(e));
        }
        return result;
    }
}
