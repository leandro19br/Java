package core.ModificadorStatico;

public class Cliente {

    /**
     * Regras:
     * 0- bloco de inicialzação estatico é executado quando a JVM carregar a classe (é executada somente 1 vez)
     * 1 - será alocado um espaço de memória para o objeto que será criado
     * 2 - cada atributo de classe será inicializado com seus valores default ou os valores explicitos
     * 3- bloco de inicialização é executado
     * 4- o Construtor é executado
     */
    private static int[] parcelas;

    /**
     * o bloco de inicialização pode ser criado em qualquer lugar na classe, porém por padrão é criado antes do construtor
     * o objetivo é criar as parcelas de 1 a 100 dentro do bloco
     */

    static {

        System.out.println("dentro do bloco de inicialização");
        //utilizando um for para criar as parcelas
        parcelas = new int[100];
        for (int i=1; i<=100; i++){
            parcelas[i-1] = i;
        }

    }


    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
}
