package core.Colecoes;

public class ColecoesTeste {
    public static void main(String[] args) {

        /*neste caso o retorno é true pois estão no mesmo pool de Strings
        String nome = "Leandro Santiago";
        String nome1 = "Leandro Santiago";
      */
        /*neste exemplo o retotno será false apaesar de terem os valores identicos
        * mans estão em locais diferentes pois quando utilizamos o new o objeto está sendo criado no HEAP(memória)*/

        String nome = "Leandro Santiago";
        String nome1 = new String( "Leandro Santiago");

        System.out.println(nome == nome1);

        //mesma coisa com integer
        Integer n = 5;
        Integer n1 = new Integer(5);

        System.out.println(n == n1);

        System.out.println("-----------------Utilizando Equals---------------------------");
        //método equals verifica o conteudo e não endereço de memória

        System.out.println(nome.equals( nome1));
        System.out.println(n.equals(n1));

        System.out.println("-----------------Utilizando Equals Sobescrito---------------------------");

        Celular c1 = new Celular("Iphone","1234");
        Celular c2 = new Celular("Iphone","1234");

        /**
         *     utilizando o equals da classe object retorna false pois verifica poição de memória e utilzado o equals
         *     sobescrito vai retornar true pois tem o mesmo numero de imei se alterar o numero retrona false
         */

        System.out.println(c1.equals(c2));


    }
}
