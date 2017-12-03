package core.comportamentoPorParametro.predicate;

import core.comportamentoPorParametro.Carro;

import java.util.Calendar;

public class CarroDezAnosFabricacaoPredicate implements CarroPredicate {
    @Override
    public boolean teste(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
