package core.comportamentoPorParametro.predicate;

import core.comportamentoPorParametro.Carro;

public class CarroCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean teste(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
