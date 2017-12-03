package br.com.santiago.introducao;

public class ArrayMultidimencional {

    public static void main(String[] args) {

        /**
         * Criando um Array de duas posições e cada posição faz referencia a mais um Array de duas posições e
         * os valores vao ficar no segundo Array
         */
        int[][] dias = new int[2][2];

        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for (int i = 0 ; i < dias.length; i++){
            for (int j = 0 ; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------utilizando foreach-----------------------------");
        for (int[] ref : dias) {
            for (int dia:ref) {
                System.out.println(dia);
            }

        }

    }
}
