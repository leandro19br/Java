package br.com.santiago.introducao;

public class Condicao {
    public static void main(String[] args) {

        /*if(false) System.out.println("entrou");

        System.out.println("não entrou");*/

        /***
         * Se não tiver o else no final das condições a variável categoria teria que ser inicializada pois se o compilador
         * achar que existe a possibilidade de a variável não ser inicializada, vai dar erro
         * obs Ctrl + alt + L formatar o código
         */
        int idade = 18;
        String categoria = "adulto";

        if (idade < 15) {

            categoria = "infantil";

        } else if (idade >= 15 && idade < 18) {

            categoria = "Juvenil";
        }
        System.out.println(categoria);

    }

}
