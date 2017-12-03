package core.lambidaJava8;

public class ComparadorCarro {

    public static int comprarPorCor(Carro o1 , Carro o2){

        return o1.getCor().compareTo(o2.getCor());

    }

    public int compararPorAno(Carro o1 , Carro o2){

        return ((Integer)o1.getAno()).compareTo(o2.getAno());

    }
}
