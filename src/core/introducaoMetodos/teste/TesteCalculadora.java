package core.introducaoMetodos.teste;

import core.introducaoMetodos.classes.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.multiplicaDoisNumeros(5, 6);//precisa ser passado dois parâmetros para o meu método
        System.out.println(calc.divideDoisNumeros(4, 0));//método retorna um valor
        //ou posso guardar dentro de uma variável o retorno do método
        double result = calc.divideDoisNumeros(8, 0);
        System.out.println(result);
        calc.imprimeDoisNumerosDivididos(5,2);

        //criando um array de numeros

        int[] numeros = {2,4,6};

        calc.somaArray(numeros);//chama o método somaAray

        calc.somaVarArgs(numeros);//posso chamar o método VarAgs utilizando Array

        calc.somaVarArgs(10,15);//posso chamar o método VarAgs passando os numeros direto




    }
}
