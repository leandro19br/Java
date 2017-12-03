package br.com.santiago.introducao;

/**
 * calcular quantidade de parcelas sendo que a parcela não pode ser menor que 1000
 */

public class CalculoValorParcela2 {

    public static void main(String[] args) {

        double valorToatal = 30000;

        for(int parcela = (int) valorToatal; parcela >= 1 ; parcela--){

            double valorParcela = valorToatal/parcela;

           if (valorParcela <= 1000){
               continue;
            }else{
                System.out.println("Parcela: " + parcela + " R$: " + valorParcela);
            }

        }


    }

}
