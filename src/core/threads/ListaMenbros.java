package core.threads;

import java.util.LinkedList;
import java.util.Queue;

public class ListaMenbros {

    //listar os emails e removendo o primeiro
    private final Queue<String> emails = new LinkedList<>();
    private boolean aberta = true; //para saber se a lista está aberta

    //metodo para verificar todos os emils pendentes dentro da lista de emails
    public int getEmailListaPendentes() {
        //como pode ser acesado por mais de uma Therad deverá ser sicronizado
        synchronized (emails) {

            return this.emails.size();
        }

    }

    public boolean isAberta() {
        return aberta;
    }

    //método para obter o e-mail
    public String obterEmail() {
        String email = null;

        try {
            synchronized (this.emails) {
                while (this.emails.size() == 0) {
                    if (!aberta) {
                        return null;
                    }
                    System.out.println("Lista Vazia. Colocando a Thread " + Thread.currentThread().getName() + " Em modo Espera");
                    this.emails.wait();//colocando a Thread em espera
                }
                //se a lista não está zero tem email cadastrado
                this.emails.poll();//remove o primeiro valor da Que
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return email;
    }

    //adicionar e-mail do convidado
    public void adicionnarEmailMembro(String email) {
        synchronized (emails){
            this.emails.add(email);
            System.out.println("Adicionando o e-mail a Lista");
            System.out.println("Notificando as Threads que estão em Espera");
            this.emails.notifyAll();//utilizado notifyAll para notificar as Threads que estavam no estado wait

        }
    }

    //método para fecar a lista que está aberta

    public void fecharLista(){

        System.out.println("Notificando todas as Threads e Fechando todas as listas");
        aberta = false;
        synchronized (emails){
            this.emails.notifyAll();//notificando as Threads sobre lista fechada
        }
    }
}
