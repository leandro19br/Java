package core.padroaProjetoSingleton;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {

    //nesta classe queremos bloquear a criação de objeto
    //inicializando o objeto diretamente no atributo é chamado de EAGER(ansioso) INITIALIZATION
    //mesmo que voce não utilize o objeto será criado pois é estatico
    //exite outra forma de Inicialização que é o LAZY INITIALIZATION (preguiçosa) que só vai criar a objeto se for realmente utiliar

    //private final static AviaoSingleton INSTANCE = new AviaoSingleton();
    //para utilizar o modo LAZY INITIALIZATION faremos uma verificação dentro do get se a instancia está nula será criado
    private static AviaoSingleton INSTANCE;
    private Set<String> listaDeAssentos;

    //utlilizando um cosntrutor para inicializar o Set e colocar dois assentos

    private AviaoSingleton(){

        this.listaDeAssentos = new HashSet<>();
        listaDeAssentos.add("A1");
        listaDeAssentos.add("A2");
    }
    //criando o get de ISNTANCE para poder ter acesso
    // se tiver mais de uma Thread fazendo acesso ao método um modo de corrigir seria
    //pegando  o lock da classe e fazer novamente o check novamente dentro do Syncronized
    public static AviaoSingleton getINSTANCE() {
        if (INSTANCE == null){
            synchronized (AviaoSingleton.class){
                if (INSTANCE == null) {

                    INSTANCE = new AviaoSingleton();
                }
            }
        }
        return INSTANCE;
    }
    //metodo para reservar o assento

    public boolean bookAssento(String assento){
        return listaDeAssentos.remove(assento);//removendo da lista
    }
}
