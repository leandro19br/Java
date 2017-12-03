package core.introducaoMetodos.teste;

import core.introducaoMetodos.classes.Calculadora;

public class TestNumeros {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        cal.alterarDoisNumeros(num1,num2);
        System.out.println("dentro do teste");
        System.out.println("numero1 " + num1);
        System.out.println("numero2 " + num2);
    }
}
