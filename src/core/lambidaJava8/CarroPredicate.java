package core.lambidaJava8;



/**
 * Interface que tem somente um método abstrato - chamada de functional interface
 */
@FunctionalInterface
public interface CarroPredicate {

   boolean teste(Carro carro);
   //(parametro) -> expressão
   //(Carro carro) -> carro.getCor().equals("verde"); o retorno será um booleano
}
