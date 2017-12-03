package core.padraoFactory;

/**
 * a complexidade da criação do objeto fica em outra classe e não na classe que está utilizando o método
 * uma maneira de desacoplar
 */

public class MoedaFactoryteste {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        System.out.println(moeda.getSimbolo());

        Moeda moeda1 = MoedaFactory.criarMoeda(Pais.EUA);
        System.out.println(moeda1.getSimbolo());
    }

}
