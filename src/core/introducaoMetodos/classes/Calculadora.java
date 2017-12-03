package core.introducaoMetodos.classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);

    }
    //recebe dois parametros que são variáveis locais
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);

    }

    //se receber como parâmetro duas variáveis do tipo double e quiser retornar um int deve ser feita um cast

    public double divideDoisNumeros(double num1 , double num2){

        if (num2 != 0){
            return num1 / num2;
        }

       return 0;
    }

    //neste caso o retirn sem nada funciona como um break
    public void imprimeDoisNumerosDivididos(double num1,double num2){
        if (num2 != 0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não pode ser dividido por 0");
    }

    public void alterarDoisNumeros(int num1 , int num2){
        num1 = 10;
        num2 = 30;
        System.out.println("dentro do método");
        System.out.println("numero1 " + num1);
        System.out.println("numero2 " + num2);
    }

    //método que soma uma lista de números
    public void somaArray(int[] numeros){
        int soma = 0;//atributo para guardar soma
        //percorre a lista de numeros
        for (int num: numeros) {
            soma += num;

        }

        System.out.println("Total soma " + soma);

    }

    /**
     *  utilizando varArgs eu posso passar tanto um Array ou direto os números como argumento separado por virgula
     *  só posso passar um varAgs por assinatura de método
     *  caso tenha autros parâmetros o Varags precisa ser o ultimo
     */

    public void somaVarArgs(int... numeros){
        int soma = 0;//atributo para guardar soma
        //percorre a lista de numeros
        for (int num: numeros) {
            soma += num;

        }

        System.out.println("Total soma utilizando VarAgs " + soma);

    }

}
