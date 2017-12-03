package core.threads;

//a jvm que vai fazer o gerenciamento das linhas de execução quem começa e quem termina
//duas formas de criar e dois tipos de Threads
//Daemom e User - diferença entre elas é que a JVM só termina depois que uma thread usuário terminar
//voce não sabe exatamente a ordem da execução das Threads

//criando uma Thread que extends Thread
class Exemplothread extends Thread{

    private char c;

    public Exemplothread(char c){
        this.c = c;
    }

    //tudo acontece dentro desse método da Classe Thread se vc quer que um código rode em paralelo deve estar dentro do run
    @Override
    public void run(){
        //para saber qual a Thread está rodando
        System.out.println("Executando " + Thread.currentThread().getName());

        for (int i = 0 ; i < 1000 ; i++){
            System.out.print(c);
            if ( i % 100 == 0){
                System.out.println();
            }
            //método sleelp da uma pausa na Thread em milesegundos
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

// outra forma de crair uma Thread

class ExemploThreadRunnable implements Runnable{

    private char c;

    public ExemploThreadRunnable(char c){
        this.c = c;
    }


    @Override
    public void run() {
        //para saber qual a Thread está rodando
        System.out.println("Executando " + Thread.currentThread().getName());

        for (int i = 0 ; i < 1000 ; i++){
            System.out.print(c);
            if ( i % 100 == 0){
                System.out.println();
            }

            /*método sleelp da uma pausa na Thread em milesegundos
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
          */

        }

    }
}

public class ThreadsTeste {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("dentro do main " + Thread.currentThread().getName());
 /*
        System.out.println("dentro do main" + Thread.currentThread().getName());
        //criando objeto
        Exemplothread e1 = new Exemplothread('A'));
        Exemplothread e2 = new Exemplothread('B');
        Exemplothread e3 = new Exemplothread('C');
        Exemplothread e4 = new Exemplothread('D');


        neste exemplo só tem a Thread main rodando
        e1.run();
        e2.run();
        e3.run();
        e4.run();

        //para iniciar uma Thread
        e1.start();
        e2.start();
        e3.start();
        e4.start();
             */

        //outra forma de criar o objeto
        Thread t1 = new Thread(new ExemploThreadRunnable('A'),"t1");
        Thread t2 = new Thread(new ExemploThreadRunnable('B'),"t2");
        Thread t3 = new Thread(new ExemploThreadRunnable('C'),"t3");
        Thread t4 = new Thread(new ExemploThreadRunnable('D'),"t4");

        t1.start();
        //main tem que esperar executar todo o método de T1 antes de começar T2
        t1.join();
        t2.start();
        //t3.start();
        //t4.start();
        //setando prioridade para Thread de 1 a 10
        t2.setPriority(Thread.MAX_PRIORITY);


    }
}
