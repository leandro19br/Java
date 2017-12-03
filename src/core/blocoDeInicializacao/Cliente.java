package core.blocoDeInicializacao;

public class Cliente {
    //numero de parcelas que o cliente pode fazer
    /**
     * Regras:
     * 1 - será alocado um espaço de memória para o objeto que será criado
     * 2 - cada atributo de classe será inicializado com seus valores default ou os valores explicitos
     * 3- bloco de inicialização é executado
     * 4- o Construtor é executado
     */
    private int[] parcelas;

    /**
     * o bloco de inicialização pode ser criado em qualquer lugar na classe, porém por padrão é criado antes do construtor
     * o objetivo é criar as parcelas de 1 a 100 dentro do bloco
     */

    {

        System.out.println("dentro do bloco de inicialização");
        //utilizando um for para criar as parcelas
        parcelas = new int[100];
        for (int i=1; i<=100; i++){
            parcelas[i-1] = i;
        }

    }

    //já tem os valores de parcela no construtor
    public Cliente(){
        System.out.println("dentro do construtor");
        for (int parcela: this.parcelas) {
            System.out.print(parcela + " ");
        }

    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
