package core.performanceString;

public class TestePerformance {
    public static void main(String[] args) {

        //calcula o tempo para criar as Strings
        long ini= System.currentTimeMillis();
        geraString(20000000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo " + (fim - ini) + "ms");

        //mais rápida
        long ini2= System.currentTimeMillis();
        geraString(20000000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo StringBuilder " + (fim2 - ini2) + "ms");

        //Buffer demora mais
        long ini3= System.currentTimeMillis();
        geraString(20000000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo StringBuffer " + (fim3 - ini3) + "ms");
    }

    public static void geraString(int tam){
        String teste = "";

        for (int i = 0; i < tam ; i++);

        teste += "i";
    }

    public static void geraStringBuilder(int tam){
        StringBuilder bd = new StringBuilder(tam);

        for (int i = 0; i < tam ; i++);

        bd.append("i");
    }

    public static void geraStringBuffer(int tam){
        StringBuffer bf = new StringBuffer(tam);

        for (int i = 0; i < tam ; i++);

        bf.append("i");
    }
}
