package core.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericaCarroTeste {

    public static void main(String[] args) {

        CarroAluguel carroAluguel = new CarroAluguel();
        Carro carro = carroAluguel.getCarroDisponivel();
        System.out.println("Carro Alugado = " + carro + "por 1 mes");
        carroAluguel.devolverCarro(carro);

    }
}

    class CarroAluguel{

        private List<Carro> carroList = new ArrayList<>();
        //bloco de inicialização de para criar o carro
        {
            carroList.add(new Carro("Gol"));
            carroList.add(new Carro("Spin"));

        }

        //método para alugar removendo o primeiro
        public Carro getCarroDisponivel(){
            Carro c = carroList.remove(0);
            System.out.println("Alugando Carro" + c);
            System.out.println("Carros Disponíveis " + carroList);
            return c;
        }

        public void devolverCarro(Carro c){

            System.out.println("Devolvendo Carro " + c.getNome());
            carroList.add(c);
            System.out.println("Carros Disponíveis " + carroList);
        }
    }

