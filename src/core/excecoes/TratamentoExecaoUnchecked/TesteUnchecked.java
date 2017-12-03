package core.excecoes.TratamentoExecaoUnchecked;

public class TesteUnchecked {
    public static void main(String[] args) {
        /*erro em tempo de execução e para tratar pode ser feito com um if
        erro em tempo de execução RunTimeException (Unchecked) normalemte é erro pela falha na logica
        mesmo não tratando o erro seu código ainda será compilado
        como por exemplo NullPointerException*/

        int a = 10;
        int b = 0;


        if (b != 0 ) {
            int c = a / b;
            System.out.println(c);
        }else{
            System.out.println("Numero não pode ser dividido por zero");
        }

        //pode ser tratada a exeção com Try/Catch, o erro será mostrado porém não vai parar

        try {
            int[] numero = new int[2];
            System.out.println(numero[2]);
            System.out.println("dentro da Exeção");
            System.out.println();
        }catch ( RuntimeException e){
            //a exeção pode ser RuntimeException(generico) por causa da herança
            e.printStackTrace();
        }
        System.out.println("Fora do bloco Catch");
    }
}
