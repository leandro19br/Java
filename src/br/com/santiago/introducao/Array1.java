package br.com.santiago.introducao;

/**
 * Criando um array de tipo primitivo
 */

public class Array1 {
    public static void main(String[] args) {

        /**
         * Como todo Array é um objeto ,a variável idade é uma variável de referência . Para que o array seja reservado
         * um espaço na memória deve ter estanciado utilizando new e passando o tamanho do Arrey
         *
         */
        int[] idade = new int[3];

        idade[0] = 15;
        idade[1] = 18;
        idade[2] = 30;

        System.out.println("idade 1 " + idade[0]);
        System.out.println("idade 2 " + idade[1]);
        System.out.println("idade 3 " + idade[2]);

    }
}
