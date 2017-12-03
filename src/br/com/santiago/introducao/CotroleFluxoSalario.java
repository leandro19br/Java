package br.com.santiago.introducao;

/***
 * Criar uma variável Salário e imprima seu imposto
 * imposto:
 * salario < 1000 5%
 * salario >=1000   && salário < 2000 10%
 * salario > 2000 && salário < 4000 15%
 * salario >5000 20%
 */


public class CotroleFluxoSalario {

    public static void main(String[] args) {

        double salario = 800;
        double imposto ;

        if (salario < 1000){


            imposto = salario * 0.05;
            salario -= imposto;
            //System.out.println("valor de imposto " + imposto);

        }else if(salario >= 1000 && salario < 2000){

            imposto = salario * 0.10;
            salario -= imposto;
            //System.out.println("valor de imposto " + imposto);


        }else if(salario > 2000 && salario < 4000){

            imposto = salario * 0.15;
            salario -= imposto;
            //System.out.println("valor de imposto " + imposto);

        }else{

            imposto = salario * 0.20;
            salario -= imposto;
           // System.out.println("valor de imposto " + imposto);

        }

        System.out.println("Valor Salário " + salario + "\nValor de Imposto " + imposto);
    }



}
