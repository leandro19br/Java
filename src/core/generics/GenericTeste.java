package core.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTeste {
    public static void main(String[] args) {
        List lista = new ArrayList();
        //até o java 4 não havia o tipo que seria criada a lista, podendo ter qq coisa dentro dela
        //o imprimir o sout transformava tudo em String. O problema era para fazer um for para
        //passar o tipo da variável que ia receber a lista, teria que ser um tipo mais genérico como a Object

        //a partir do java 5 foi introduzido o Generics
        //generics existe somente em tempo de compilação para manter a retrocompatibilidade
        List<String> lista2 = new ArrayList<>();



    }
}
