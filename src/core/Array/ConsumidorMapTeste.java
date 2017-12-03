package core.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTeste {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Leandro","1234");
        Consumidor consumidor2 = new Consumidor("Miguel","4321");

        Produto p1 = new Produto("123","Iphone",4000.0,5);
        Produto p2 = new Produto("321","Teclado",120.0,0);
        Produto p3 = new Produto("012","Galaxy Note",2500.0,10);
        Produto p4 = new Produto("456","Mouse",40.0,0);

        //associando um consumiro a um produto
        Map<Consumidor,Produto> map = new HashMap<>();
        map.put(consumidor,p2);
        map.put(consumidor2,p1);

        for (Map.Entry<Consumidor,Produto> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome() + " " + entry.getValue().getNome());
        }
        System.out.println("------------------------------------------------");
        //se um consumidor consumir mais de um produto

        List<Produto> consumidorLista = new ArrayList<>();
        consumidorLista.add(p1);
        consumidorLista.add(p2);

        List<Produto> consumidor2Lista = new ArrayList<>();
        consumidor2Lista.add(p3);
        consumidor2Lista.add(p4);

        Map<Consumidor,List<Produto>> map2 = new HashMap<>();
        map2.put(consumidor,consumidorLista);
        map2.put(consumidor2,consumidor2Lista);

        //mostrando o consumidor e o produto comprado
        for (Map.Entry<Consumidor,List<Produto>> entry : map2.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto p : entry.getValue()){
                System.out.println(p.getNome());
            }
        }

    }
}
