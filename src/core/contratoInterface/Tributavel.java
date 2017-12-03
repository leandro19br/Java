package core.contratoInterface;

/**
 * Em uma interface todos os métodos são abstratos e vc implementa uma interface que é umm "contrato"
 */

public interface Tributavel {

    //todos os atributos são consideradas constantes em uma interface

    public static final double IMPOSTO = 0.2;

    //por mais que não coloque abstract todos os métodos são considerados abstract

    void calculaImposto();

}
