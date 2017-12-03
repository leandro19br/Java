package core.concorrencia;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * utilizando variável atômica do pacote concorrent para gerenciar as Threads similar ao colocar synchronized no método
 * Depois utilizando o lock para gerenciar as Threads liberando uma por vez num bloco de código e as outras ficam num
 * estado de espera até que seja liberado
 */

class Contador{

    private int contador;
    private AtomicInteger atomicInteger = new AtomicInteger();//gerencia concorrência entre Threads sem onerar processamento
    private Lock lock = new ReentrantLock(true);//lock é uma interface e a classe ReentrantLock implementa essa interface

    /*
    public  void incremente(){
        contador ++;
        atomicInteger.getAndIncrement();

    }
*/

    public synchronized void incrementeComsynchronized(){
        contador ++;
        atomicInteger.getAndIncrement();

    }

    public synchronized void incrementeComLock(){

        lock.lock();//pegar a Thread

        try {
            contador ++;
            atomicInteger.getAndIncrement();

        }finally {
            lock.unlock();//libera o lock
        }


    }


    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getAtomicInteger() {
        return atomicInteger.intValue();
    }

    public Lock getLock() {
        return lock;
    }
}

class IncrementadorThread extends Thread{

    private Contador contador;

    public IncrementadorThread(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run(){

        for (int i = 0 ; i < 10000 ; i ++){
            contador.incrementeComLock();
        }

    }


}

public class Concorrencia_teste {
    public static void main(String[] args) throws Exception {
        Contador c = new Contador();
        IncrementadorThread i = new IncrementadorThread(c);
        IncrementadorThread i2 = new IncrementadorThread(c);
        i.start();
        i2.start();
        i.join();
        i2.join();
        System.out.println(c.getContador());
        System.out.println("utilizando Atomic " + c.getAtomicInteger());//sempre será o mesmo resultado sem precisar utilizar o syncronize


    }
}
