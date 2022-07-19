package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Seu Madruga");
        Consumidor consumidor2 = new Consumidor("Seu Barriga");
        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(3L, "Bersek", 15.6);
        Manga manga3 = new Manga(2L, "Naruto", 20.0);
        Manga manga4 = new Manga(1L, "Dragon Ball Z", 70.0);
        Manga manga5 = new Manga(4L, "CDZ", 11.9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue().getNome());
        }
    }
}
