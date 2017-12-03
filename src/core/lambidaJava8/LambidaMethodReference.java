package core.lambidaJava8;

import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

public class LambidaMethodReference {
    public static void main(String[] args) {
        forEach(asList("Leandro","Miguel","Gustavo"),System.out::println);
        List<Carro> carros = asList(new Carro("preto",2011),new Carro("verde",2001),
                new Carro("branco",2017));
        //usando referenia a um método estático ordenando por cor
        Collections.sort(carros,ComparadorCarro::comprarPorCor);
        System.out.println(carros);
        //usando referência de um objeto com um método não estático ordenando por ano
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Collections.sort(carros,comparadorCarro::compararPorAno);
        System.out.println(carros);
        //usando referência de uma Classe com método não estático ordenando nomes
        List<String>nomes = asList("Leandro","Miguel","Gustavo");
        nomes.sort((s1,s2) -> s1.compareTo(s2));
        nomes.sort((s1,s2) -> s2.compareTo(s1));//comparação inversa
        //nomes.sort(String::compareTo);
        System.out.println(nomes);
        BiPredicate<List<String>,String> contains = (lista, elemento) -> lista.contains(elemento);
        System.out.println(contains.test(nomes,"Miguel"));
        BiPredicate<List<String>,String> contains1 = List::contains;
        System.out.println(contains1.test(nomes,"Leandro"));
        //usando referencia a construtores
        //BiFunction recebe 2 tipos e 1 retorno e o contrutor do carro precia de uma String, um int e retorna um Carro
        BiFunction<String, Integer, Carro> carroBiFunction = (s,i) -> new Carro(s,1);
        BiFunction<String, Integer, Carro> carroBiFunction1 =  Carro::new;

        System.out.println(carroBiFunction.apply("Roxo",1998));
        System.out.println(carroBiFunction1.apply("Rosa",1967));







    }

    public static <T> void forEach(List<T> list , Consumer<T> consumer){
        for (T e: list) {
            consumer.accept(e);//método da Classe consumer
        }
    }

}
