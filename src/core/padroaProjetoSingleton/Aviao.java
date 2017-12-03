package core.padroaProjetoSingleton;

import java.util.HashSet;
import java.util.Set;

public class Aviao {
    //criando uma lista de assentos utilizando Set
    private Set<String> listaDeAssentos;

    //utlilizando um cosntrutor para inicializar o Set e colocar dois assentos

    public Aviao(){
        this.listaDeAssentos = new HashSet<>();
        listaDeAssentos.add("A1");
        listaDeAssentos.add("A2");
   }

   //metodo para reservar o assento

    public boolean bookAssento(String assento){
        return listaDeAssentos.remove(assento);//removendo da lista
    }

}
