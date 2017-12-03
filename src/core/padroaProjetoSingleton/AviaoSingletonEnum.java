package core.padroaProjetoSingleton;

import java.util.HashSet;
import java.util.Set;

public enum AviaoSingletonEnum {
    
    INSTANCE;

    private Set<String> listaDeAssentos;

    //construtor

    AviaoSingletonEnum(){
        this.listaDeAssentos = new HashSet<>();
        listaDeAssentos.add("A1");
        listaDeAssentos.add("A2");
    }
    public boolean bookAssento(String assento){
        return listaDeAssentos.remove(assento);
    }

    public static void reservarAssento(String assento){

        AviaoSingletonEnum a = AviaoSingletonEnum.INSTANCE;
        System.out.println(a.bookAssento(assento));

    }
}
