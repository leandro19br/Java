package br.com.santiago.introducao;

/***
 * Objetivo do operador tenário é inicializar uma variável  utilizando uma instrução em uma linha só, facilitando o uso de
 * if e else depois da ? é considerado verdadeiro e depois dos : considerado falso
 */

public class OperadorTenario{

    public static void main(String[] args) {

        int idade = 17;

        String status;

        if (idade < 18){

            status = "Não Adulto";

        }else {

            status = "Adulto";

        }

        System.out.println(status);

    //utilizando operador ternário o resultado tem que ser um boolean

        idade = 19;

        String statuss = idade < 18 ? "Não Adulto"  : "Adulto" ;

        System.out.println(statuss);

    }
}
