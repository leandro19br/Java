package core.ClassesWrapper;

/**
 * Classes utilitárias
 *
 */
public class testeWhepper{

    public static void main(String[] args) {
        //tipos primitivos de variáveis que são 8
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 1;
        long longPrimitivo = 1;
        float floatPrimitivo = 1;
        double doublePrimitivo = 1;
        char charPrimitivo = 'a';
        boolean booleanPrimitivo = false;

        //Classes Wrapper = primeira letra maiuscula = objetos
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer inteiroWrapper = new Integer("123");//posso passar como String e o java converte
        Long longWrapper = 1L;
        Float floatWrapper = new Float("23.9");
        Double doubleWrapper = 1D;
        Character charWrapper = 'A';
        Boolean booleanWrapper = true;

        //conversão de String para float usando psrse

        String valor = "10";
        Float f = Float.parseFloat(valor);//método parse
        System.out.println(f);
        //classes utilitárias em java
        System.out.println(Character.isDigit('1'));//método verifica se é um digito
        System.out.println(Character.isLetter('a'));///método verifica se é uma letra
        System.out.println(Character.isLetterOrDigit('#'));///método verifica se é uma letra ou digito
        System.out.println(Character.isUpperCase('a'));///método verifica se está em maiúculo
        System.out.println(Character.isLowerCase('A'));///método verifica se está em minusculo
        System.out.println(Character.toUpperCase('a'));///método coloca em maiusculo
        System.out.println(Character.toLowerCase('A'));///método coloca em minusculo




    }
}
