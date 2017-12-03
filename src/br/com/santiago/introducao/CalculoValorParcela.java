package br.com.santiago.introducao;

/**
 * calcular quantidade de parcelas sendo que a parcela não pode ser menor que 1000
 */

public class CalculoValorParcela {

    public static void main(String[] args) {

        double valorToatal = 30000;

        for(int parcela = 1; parcela <= valorToatal ; parcela++){
            //por exemplo se a parcela for 1 30/1 = 30 mil
            double valorParcela = valorToatal/parcela;
            if (valorParcela < 1000){
                break;
            }else{
                System.out.println("Parcela: " + parcela + " R$: " + valorParcela);
            }

        }


    }

}
