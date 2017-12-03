package core.concorrencia;

//exemplo de uma classe imutável, pois a classe é final nunca poderá ser extendida e não tem modificador para alterar os atributos

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class Pessoa{

    private final String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}


public class CopyOnWriteTeste implements Runnable{

    private List<Integer> list = new CopyOnWriteArrayList<>();//toda vez que o aray for alterado será criada uma cópia

    //cnstrutor para iniciar a lista
    public CopyOnWriteTeste(){
        for (int i = 0 ; i < 9000 ; i ++){

            list.add(i);

        }

    }

    @Override
    public void run() {

    }
}
