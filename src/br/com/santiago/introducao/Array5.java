package br.com.santiago.introducao;

public class Array5 {

    public static void main(String[] args) {
        /**
         * fszendo referência a arrays multidimensional de tamanhos diferentes
         *
         */

/*
        int [] [] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int []{1,2,3};
        dias[2] = new int[4];
*/
        //percorrendo os numeros com foreach
        int [] [] dias = {{0,0},{1,2,3},{0,0,0,0}};

        for (int[] arr: dias) {
            for (int num: arr) {
                System.out.println(num);
            }
        }
    }
}
