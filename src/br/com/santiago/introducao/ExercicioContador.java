package br.com.santiago.introducao;

public class ExercicioContador {
    public static void main(String[] args) {
        /**
         * contador imprima numeros pares de 0 a 100000
         */

        int numero = 100000;

        //impares

        for (int i = 0; i <= numero; i++){
            if (i%2!= 0){
                System.out.println(i);
            }

        }
    }
}
