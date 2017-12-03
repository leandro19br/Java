package core.lambidaJava8;

import java.util.List;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

public class LambidaConsumer {
    public static void main(String[] args) {

        //utilizando o método asList da Classe Array
        //passando uma lista e para o Consumer o parâmetro e ação imprime cada elemento s
        forEach(asList("Leandro","Miguel","Gustavo"),(String s) -> System.out.println(s));
    }

    //criando um método estático generico utilizando a Classe Consumer que tem um método accept estático sem retorno
    //é utilizado quando vc precisa fazer alguma operação com o objeto  que foi passado

    public static <T> void forEach(List<T> list , Consumer<T> consumer){
        for (T e: list) {
            consumer.accept(e);//método da Classe consumer
        }
    }

}
