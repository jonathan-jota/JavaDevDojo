package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(3L, "Bersek", 15.6, 0));
        mangas.add(new Manga(2L, "Naruto", 20.0, 4));
        mangas.add(new Manga(1L, "Dragon Ball Z", 70.0, 3));
        mangas.add(new Manga(4L, "CDZ", 11.9, 0));
        for(Manga manga: mangas.descendingSet()){
            System.out.println(manga);
        }
        System.out.println("-------------");
        for(Manga manga: mangas){
            System.out.println(manga);
        }

        /**
         * lower <
         * floor <=
         * higher >
         * ceiling >=
         */
        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 11.9, 5);
        System.out.println("-------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
        System.out.println("----------");
        System.out.println(mangas.size());
//        System.out.println(mangas.pollFirst());//Retorna e remove o primeiro elemento menor
        System.out.println(mangas.pollLast());//Retorna e remove o ultimo maior elemento
        System.out.println(mangas.size());

    }
}
