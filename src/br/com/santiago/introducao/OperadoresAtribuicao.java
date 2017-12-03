package br.com.santiago.introducao;

public class OperadoresAtribuicao {

    public static void main(String[] args) {

         int salario = 1000;
         int desconto = 100;
         int numero = 11;
         numero %= 2; //resto

        System.out.println(salario += salario); //salario + salario = 2000 sout + tab
       // System.out.println(salario -= desconto); //salario - desconto = 1900
       // System.out.println(salario *= 0.10); //salario  *10% = 200
        System.out.println(salario = (int) (salario + ( salario * 0.10))); //mostra o salário + 10% = 2200
        System.out.println(numero); //resto 1



    }
}
