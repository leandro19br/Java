package core.classeStrings;

public class ClasseString {
    public static void main(String[] args) {
         // podem ser criado das duas formas

        String nome = "Leandro";//está criando uma referenia em memória no pool de Strings
        String sobreNome = new String(" Santiago");//desta forma está crisndo um objeto

        System.out.println(nome + sobreNome);

        //as Strings são imutáveis

        String nome2 = "Miguel";
        //nome2 += " Santiago";//concatena a String
        nome2.concat(" Campos Santiago");//está concatenando em memória, mas não muda na variável de referencia
       nome2 =  nome2.concat(" Campos Santiago");//desta forma estará apontando para a nova referencia

        System.out.println(nome2);
        //Métodos úteis da classe String

        String teste = "     Leandro";
        String teste1 = "    LEANDRO";
        String teste2 = "     Leandro Santiago ";
        System.out.println(teste.toLowerCase());//metodo que retorna a String em minuscula
        System.out.println(teste.toUpperCase());//metodo que retorna a String em maiúscula
        System.out.println(teste.length());//metodo que retorna a quantidade de caracteres
        System.out.println(teste.charAt(2));//qual o caractere na posição 2
        System.out.println(teste.equalsIgnoreCase(teste1));//compara as duas String ignorando maiuscula e miniscula
        System.out.println(teste.equals(teste1));//compara as duas String (sempre)
        System.out.println(teste.replace('o','a'));//troca caractere
        System.out.println(teste1.substring(0,3));//pega do 0 a posição 2 neste exemplo
        System.out.println(teste.trim());//retira os espaços





    }
}
