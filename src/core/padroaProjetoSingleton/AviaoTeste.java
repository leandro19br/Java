package core.padroaProjetoSingleton;

public class AviaoTeste {
    public static void main(String[] args) {

        //chamando o método reservar assento, esse método vai retornar true duas vezes deixando fazer a reserva do mesmo
        //assento duas vezes

        reservarAssento("A1");
        reservarAssento("A1");


    }

    //método parar reservar o assento de um avião
    private static void reservarAssento(String assento){
        //criando mais de uma instância de avião estaremos duplicando os atributos e para resolver esse problema
        //utilizaremos o padrão de projeto Singleton

        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));

    }
}
