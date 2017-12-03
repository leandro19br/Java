package core.Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
        //classe Map mantem uma interação chave - valor
        //não pode existir chave duplicada
        //o HashMap não mantem a ordem de inserção, o LinkedHashMap sim
        Map<String,String> map = new LinkedHashMap<>();
        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        //map.put("vc","você2");//se estiver duplicado será substituido
        map.put("meza","mesa");

        //iteração sobre esse map pela chave
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        //pelo valor
        for (String key: map.values()) {
            System.out.println(key);
        }
        System.out.println("--------------------------------------");
        //pelo valor e chave
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue() );

        }

    }
}
