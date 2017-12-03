package br.com.santiago.introducao;

/***
 * Utilizando Switch para condições simples
 * aceita tipos String a partir do java 7
 * char,int,byte,short e enum
 * Precisa ser colocado o comando Break senão irá imprimir o restante após ter encontrado a condição
 * será executado tudo que estiver depois dos dois pontos
 */


public class ControleFluxoDia {

    public static void main(String[] args) {

        byte dia = 5;

        switch (dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                if(true) System.out.println("true");
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

        }

        char sexo = 'Z' ;
        switch (sexo){
            case 'M' :
                System.out.println("Masculino");break;
            case 'F' :
                System.out.println("Feminino");break;
             default:
                 System.out.println("Opção Inválida");
        }




    }
}
