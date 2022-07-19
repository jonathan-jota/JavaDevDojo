package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("E", "Letra E");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("B", "Letra B");

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+ "-" + entry.getValue());
        }
        System.out.println(map.headMap("C"));//retorna tudo que estiver acima do C
        System.out.println(map.headMap("C", true));//retorna tudo acima do C inclusive ele mesmo
        System.out.println(map.ceilingKey("C"));
    }
}
