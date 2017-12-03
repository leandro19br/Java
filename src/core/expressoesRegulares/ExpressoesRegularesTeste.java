package core.expressoesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTeste {

    public static void main(String[] args) {
        //duas classes para trabalhar com expressoes reg
        //meta caracteres \d - busca em um texto todos os digitos(numeros)
        //meta caracteres \D - busca em um texto tudo que não for digitos(numeros)
        //meta caracteres \s - busca em um texto espaços em branco \t,\n,\f,\r
        //meta caracteres \S - busca em um texto que não é branco \t,\n,\f,\r
        //meta caracteres \w - busca em um texto por caracteres de palavras
        //meta caracteres \W - busca em um texto o que não for caracteres de palavras
        //[]String reges = "[abcABC]"; encontra a , b ou c ou [a-cA-C] ou [0-9]
        //codificadores ? - zero ou uma ocorrência * - zero ou mais ocorrências
        // + - uma ou mais ocorrência
        //{n,n} de n ate n
        //() abrupar
        // | ou
        // $ - fim de linha
        // o[v|c]o = ovo oco
        // .é um carctere coringa
        //^ [abc] - caractere de negação

        //String reges = "\\W";
        // String reges = "0[xX]([0-9a-fA-F])+(\\s|$)";
        //String texto = "12 0x 0X 0xffabc 0x10g 0x1";
        //String reges = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";//expressão para buscar email
        //String reges = "([\\w._-])+@([a-zA-Z])+(\\.([\\w])+)+";//expressão para buscar email
        //String texto = "leandro.19br@gmail.com 123abd@hotmail.com.br teste@gmail.com";
        //String reges = "\\d\\d/\\d\\d/\\d\\d\\d\\d";//expressão para buscar email
        //String reges = "\\d{2}/\\d{2}/\\d{2,4}";//expressão para buscar data
        //String texto = "05/10/2010 05/11/2015 30/10/2017 30/10/17";

        String reges = "proj([^,])+";//caractere de negação
        String texto = "proj1.bkp,proj1.java";

        Pattern patter = Pattern.compile(reges);
        Matcher matcher = patter.matcher(texto);
        System.out.println("texto  " + texto);
        System.out.println("indice 0123456789 ");
        System.out.println("expressão " + matcher.pattern());
        System.out.println("posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " "+ matcher.group());
        }

    }
}
