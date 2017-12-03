package core.comportamentoPorParametro;

/**
 * se o cloente pede uma lista de carros verde voce vai criar o método que retorna a lista de carros verdes.
 * Se ele pede outra cor também você não ai reencrever o método para outra cor e qual a saida? fazer um método filtar carroPorCor
 * e passar a cor como parâmetro
 */

import core.comportamentoPorParametro.predicate.CarroPredicate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class CarroTeste {

    //metodo que retorna uma lista de carro da cor verde

    private static List<Carro> listaCarroVerde(List<Carro> carros){

        List<Carro> result = new ArrayList<>();//variável temporária para guardar o resultado da busca
            for (Carro carro : carros){
                if (carro.getCor().equals("verde")){
                    result.add(carro);
                }

            }

        return result;//retorna o result que é a lista de carros verde
    }

    private static List<Carro> listaCarroPorCor(List<Carro> carros, String cor){

        List<Carro> result = new ArrayList<>();//variável temporária para guardar o resultado da busca
        for (Carro carro : carros){
            if (carro.getCor().equals(cor)){
                result.add(carro);
            }

        }

        return result;//retorna o result que é a lista de carros
    }
    //listar os carros com mais de 10 anos de fabricação
    private static List<Carro> listaCarroDezAnosFabricados(List<Carro> carros){

        List<Carro> result = new ArrayList<>();//variável temporária para guardar o resultado da busca
        for (Carro carro : carros){
            if (carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10){
                result.add(carro);
            }

        }

        return result;//retorna o result que é a lista de carros
    }

    public static List<Carro> filtrarCarro(List<Carro> carros, CarroPredicate carroPredicate){

        List<Carro> result = new ArrayList<>();//variável temporária para guardar o resultado da busca

        for (Carro carro : carros){
            if (carroPredicate.teste(carro)){
                result.add(carro);//adiciona na lista
            }
        }

        return result;

    }

    //utiliando um metodo que recebe uma lista generica utilizando a Interface Predicate e o método test do java 8
    public static <T> List<T> filtrar (List<T> lista, Predicate<T> predicate){

        List<T> result = new ArrayList<>();

        for (T e : lista) {
            if (predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        //criando uma lista de carros
        List<Carro> carros = asList(new Carro("preto",1995),new Carro("verde",2008),new Carro("branco",2010));
        /*
        System.out.println(listaCarroVerde(carros));//chamando o método estático passando a lista de carros
        System.out.println(listaCarroPorCor(carros,"preto")); //chamando o método estático listaCarroPorCor, passando a lista de carros e a cor
        System.out.println("Litar por ano" + listaCarroDezAnosFabricados(carros));
        */
        /*utilizano o método para filtar o carro
        System.out.println(filtrarCarro(carros,new CarroCorVerdePredicate()));
        System.out.println(filtrarCarro(carros,new CarroDezAnosFabricacaoPredicate()));
        */
        System.out.println(filtrarCarro(carros, new CarroPredicate() {
            @Override
            public boolean teste(Carro carro) {
                return carro.getCor().equals("verde");
            }
        }));


        System.out.println(filtrar(carros, new Predicate<Carro>() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        }));

    }
}
