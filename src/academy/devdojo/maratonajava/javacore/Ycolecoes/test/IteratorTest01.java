package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class IteratorTest01 {
    public static void main(String[] args) {
//        List<Manga> mangas = new ArrayList<>(6);
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(3L, "Bersek", 15.6, 0));
        mangas.add(new Manga(2L, "Naruto", 20.0, 4));
        mangas.add(new Manga(1L, "Dragon Ball Z", 70.0, 3));
        mangas.add(new Manga(4L, "CDZ", 11.9, 0));
        Collections.sort(mangas);

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);


        for(Manga manga: mangas) {
            System.out.println(manga);
        }

    }
}
