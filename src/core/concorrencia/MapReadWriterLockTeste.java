package core.concorrencia;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite{

    private Map<String,String> map = new LinkedHashMap<>();

    //metodo para colcor os maps
    public void put(String key, String valur){
        map.put(key,valur);

    }

    //metodo listas os maps

    public Object[] allKeys(){
        return map.keySet().toArray();
    }

}

public class MapReadWriterLockTeste {

    private final static MapReadWrite mapReadWrite = new MapReadWrite();
    private final static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(new ReadA());
        Thread t2 = new Thread(new ReadB());
        Thread t3 = new Thread(new Write());
        t1.start();
        t2.start();
        t3.start();


    }

    static class Write implements Runnable{

        @Override
        public void run() {

            for (int i = 0 ; i < 100 ; i++){
                rwl.writeLock().lock();
                try{
                    mapReadWrite.put(String.valueOf(i),String.valueOf(i));
                }finally {
                rwl.writeLock().unlock();
                }

            }

        }
    }

    static class ReadA implements Runnable{

            @Override
            public void run() {

                for (int i = 0 ; i < 10 ; i++){
                    rwl.readLock().lock();
                    try{
                        System.out.println(Thread.currentThread().getName() + " " + Arrays.toString(mapReadWrite.allKeys()));
                    }finally {
                        rwl.readLock().unlock();
                    }

                }

            }
    }

    static class ReadB implements Runnable{

        @Override
        public void run() {

            for (int i = 0 ; i < 10 ; i++){
                rwl.readLock().lock();
                try{
                    System.out.println(Thread.currentThread().getName() + " " + Arrays.toString(mapReadWrite.allKeys()));
                }finally {
                    rwl.readLock().unlock();
                }

            }

        }
    }

}
