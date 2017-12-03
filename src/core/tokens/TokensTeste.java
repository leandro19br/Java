package core.tokens;


//os nomes são os tokens e os delimitadores é a virgulas
public class TokensTeste {

    public static void main(String[] args) {

        String nomes = "Leandro, Miguel, Gustavo, Erica";
        String[] lista = nomes.split(",");//pega os nomes separados por virgula e retorna uma lista
        for (String nome: lista) {
            System.out.println(nome.trim());//resultado vem com espaços para elimina espaçoes em branco utiliza se metodo trim()

        }

        String nomes2 = "Leandro1, Miguel2, Gustavo3, Erica";
        String[] lista2 = nomes.split("\\d");//pega os nomes separados por virgula e retorna uma lista
        for (String nome: lista2) {
            System.out.println(nome.trim());//resultado vem com espaços para elimina espaçoes em branco utiliza se metodo trim()

        }



    }


}
