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
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Madruga");
        nomes.add("Chavinho");
        nomes2.add("Florinda");
        nomes2.add("Kiko");

        nomes.addAll(nomes2);

//        nomes.remove("Madruga");
//        System.out.println(nomes.remove("Chiquinha"));

        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Chiquinha");
        System.out.println("-----------------");
        int size = nomes.size();
        for (int i = 0; i < size;i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);

        List<Integer> numeros = new ArrayList<>();//Não permite tipos primitivos, somente através do wrapper
        numeros.add(1);

    }
}
