package core.generics;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {
    public static void main(String[] args) {

        //criando uma lista de Carros

        List<Carro> carroList = new ArrayList<>();
        carroList.add(new Carro("Gol"));
        carroList.add(new Carro("Spin"));
        //criando objeto
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carroList);
        Carro c = carroAlugavel.getObjetoDisponivel();
        System.out.println("Carro alugado por 1 mes");
        carroAlugavel.devolverObjeto(c);
        System.out.println("Carro Devolvido " + c);


    }
}
//T = Type, ou seja será uma classe generica será definido em tempo de compilação
class ObjetosAlugaveis<T>{

    private List<T> objetosDisponiveis;

    //utilizando ocntrutor para objetos Alugaveis
    public ObjetosAlugaveis(List<T> objetosDisponiveis){
            this.objetosDisponiveis = objetosDisponiveis;

    }



    //método para alugar removendo o primeiro
    public T getObjetoDisponivel(){
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto" + t);
        System.out.println("Objetos Disponíveis " + objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t){

        System.out.println("Devolvendo Objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos Disponíveis " + objetosDisponiveis);
    }
}

