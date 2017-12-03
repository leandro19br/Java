package core.generics;

import java.util.ArrayList;
import java.util.List;

abstract class Animal{
public abstract void consultar();

}

class Cachorro extends Animal{


    @Override
    public void consultar() {
        System.out.println("Consultando Cachorro");
    }


}

class Gato extends Animal{


    @Override
    public void consultar() {
        System.out.println("Consultando Gato");
    }
}


public class CaractereCoringaTeste {
    public static void main(String[] args) {

        //criando dois arrays
        Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
        Gato[] gato = {new Gato(),new Gato()};
        //consultaAnial(cachorros);
        //consultaAnial(gato);

        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());

        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());
        System.out.println("_____________________________________--");
        consultaListaAnimal(cachorroList);
        consultaListaAnimal(gatoList);


    }
    
    public static void consultaAnial(Animal[] animais){
        for (Animal animal : animais) {
            animal.consultar();//chamando o método
        }
        
    }

    //utilizando o caractere coringa ? para receber uma lista de qq coisa que seja subclasse de Animal, mas não vai adicionar nada a lista
    //se tentar inserir vai dar erro de compilação

    public static void consultaListaAnimal(List<? extends Animal> animais){
        for (Animal animal : animais){
            animal.consultar();

        }
    }
}
