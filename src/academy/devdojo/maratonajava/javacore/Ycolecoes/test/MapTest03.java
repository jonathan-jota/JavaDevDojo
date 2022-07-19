package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Seu Madruga");
        Consumidor consumidor2 = new Consumidor("Seu Barriga");
        Manga manga1 = new Manga(5L, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(3L, "Bersek", 15.6);
        Manga manga3 = new Manga(2L, "Naruto", 20.0);
        Manga manga4 = new Manga(1L, "Dragon Ball Z", 70.0);
        Manga manga5 = new Manga(4L, "CDZ", 11.9);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("---" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----" + manga.getNome());
            }
        }

    }
}
