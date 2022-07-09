package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(3L, "Bersek", 15.6));
        mangas.add(new Manga(2L, "Naruto", 20.0));
        mangas.add(new Manga(1L, "Dragon Ball Z", 70.0));
        mangas.add(new Manga(4L, "CDZ", 11.9));
        System.out.println(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
