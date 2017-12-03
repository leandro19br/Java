package core.threads;

/**
 * Quando deve ser utilizado: quando duas Threads não podem alterar um dado ao mesmo tempo
 * sincronismo de código - nenhuma thread pode acessar o método sacar enquanto a outra não terminar isso é chamado de
 * sincronismo de código ou lock
 *
 */

public class ContaTeste implements Runnable {

    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTeste contaTeste = new ContaTeste();
        //criando duas Thread e startando
        Thread leandro = new Thread(contaTeste, "Leandro");
        Thread erica = new Thread(contaTeste, "Erica");
        leandro.start();
        erica.start();
    }



    //synchronized diz que o método poderá ser acessado apenas 1 thread por vez
    //não importa se a Thread for pausada, a outra só vai poder entrar depois que a primeira terminar
    private synchronized void saque(int valor){

        if (conta.getSaldo() >= valor){
            System.out.println(Thread.currentThread().getName() + " Está indo sacar");
            conta.saque(valor);
            System.out.println(Thread.currentThread().getName() + " completou o saque, saldo " + conta.getSaldo());
        }else {
            System.out.println("sem dinheiro para " + Thread.currentThread().getName() + " fazer o saque, saldo " + conta.getSaldo());
        }

    }

    @Override
    public void run() {
        //fazendo um for onde poderá fazer no máximo 5 saques
        for (int i = 0 ; i< 5 ; i++){
            saque(10);
            if (conta.getSaldo() < 0){
                System.out.println("Ok meu Deus !");
            }
        }
    }
}
