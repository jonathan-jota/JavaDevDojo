package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Attack on Titan", 19.9));
        mangas.add(new Manga(3L, "Bersek", 15.6));
        mangas.add(new Manga(2L, "Naruto", 20.0));
        mangas.add(new Manga(1L, "Dragon Ball Z", 70.0));
        mangas.add(new Manga(4L, "CDZ", 11.9));

//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for(Manga manga: mangas) {
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(1L, "Dragon Ball Z", 70.0);
//        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
