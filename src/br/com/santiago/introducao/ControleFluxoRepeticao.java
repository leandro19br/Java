package br.com.santiago.introducao;

/**
 * While utiliza -se para uma repetição de código que está dentro dos {} enquanto a condição for verdade ou true
 */

public class ControleFluxoRepeticao {

    public static void main(String[] args) {
        int contador = 11;
        while(contador < 10){

            System.out.println(++contador); //soma primeiro ou incrementa primeiro
            //System.out.println(contador++);

        }
        /**
         *
         * no do while é parecido com o while com a diferença que será executado pelo menos uma vez mesmo que a condição seja false
         *
         */
        contador = 0;
        do {
            System.out.println("Dentro do do while " + contador++);
        }while (contador < 10);

        /**
         *o break pode ser utilizado caso o seu objetivo seja atingido para sair do bloco de código
         * pode ser utilizado em While,for e switch
         */

        for (int i = 0; i<10; i++){

            System.out.println("Valor de i é: " + i);
            if (i == 5){
                break;
            }
        }

   }
}
