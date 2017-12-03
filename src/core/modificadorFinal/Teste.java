package core.modificadorFinal;

public class Teste {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setNome("Ferrari");
        c.setMarca("Ferrari");
        /**
         * Carro.VELOCIDADE_FINAL = 300; não é permitida a alteração da velocidade
         */
        //neste momento o comprador está null pois o objeto foi criado mas está com o vaor padrão
        System.out.println(c.getComprador());
        //o valor pode ser alterado
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());
        /*mas voce não pode criar outro objeto pois não pode ser criado uma nova referência vai dar erro de compilação
        c.comprador = new Comprador();*/
    }
}
