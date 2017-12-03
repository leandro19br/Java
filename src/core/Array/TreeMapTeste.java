package core.Array;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTeste {
    public static void main(String[] args) {
        //utilizando NavigableMap

        NavigableMap<String,String> navigableMap = new TreeMap<>();
        //por mais que seja inserido aleatóriamente ao exibir a lista está organizado por isso o objeto precisa
        // implementar comparable para não dar erro de compilação
        navigableMap.put("D","Letra D");
        navigableMap.put("B","Letra B");
        navigableMap.put("A","Letra A");
        navigableMap.put("C","Letra D");

        for (Map.Entry<String,String> entry : navigableMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
