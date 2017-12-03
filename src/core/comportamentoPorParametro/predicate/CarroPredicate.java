package core.comportamentoPorParametro.predicate;

import core.comportamentoPorParametro.Carro;

/**
 * Interface que tem somente um método abstrato - chamada de functional interface
 */
@FunctionalInterface
public interface CarroPredicate {

   boolean teste(Carro carro);
}
