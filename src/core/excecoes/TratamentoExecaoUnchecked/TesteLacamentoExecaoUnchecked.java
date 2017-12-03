package core.excecoes.TratamentoExecaoUnchecked;

public class TesteLacamentoExecaoUnchecked {
    public static void main(String[] args) {

        //chamando o método divisão e tratando no Try/catch

        try {
            divisao(10,0);
        }catch (RuntimeException e){
            e.printStackTrace();//utilizado em log
            System.out.println(e.getMessage());//pode ser exibido para o usuário
        }

    }

    private static void divisao(int num1,int num2){

        if (num2 == 0){
            //faz um lançamento de execeção para o método que o chamou
            throw new IllegalArgumentException("Digite um valor diferente de ZERO");
        }
        int result = num1 / num2;
        System.out.println(result);
    }
}
