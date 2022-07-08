package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Bersek");
        mangas.add("Naruto");
        mangas.add("Dragon Ball Z");
        mangas.add("CDZ");
        Collections.sort(mangas);

        for(String manga: mangas) {
            System.out.println(manga);
        }
    }
}
