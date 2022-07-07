package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList();//Até a versão 1.4 do java
//        nomes.add("Madruga");
//        nomes.add("Chavinho");
//        nomes.add(121);

        List<String> nomes = new ArrayList<>(16);//A partir da versão 1.5
        nomes.add("Madruga");
        nomes.add("Chavinho");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Chiquinha");
        System.out.println("-----------------");
        for (int i = 0; i <nomes.size();i++) {
            System.out.println(nomes.get(i));
        }
    }
}
