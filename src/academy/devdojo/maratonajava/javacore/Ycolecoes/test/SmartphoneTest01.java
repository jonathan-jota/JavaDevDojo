package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1BAC3", "Samsung");
        Smartphone s2 = new Smartphone("1BAD3", "Pixel");
        Smartphone s3 = new Smartphone("3B743", "Iphone");

        List<Smartphone> smartphones = new ArrayList<>(5);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        //smartphones.clear();

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("1BAD3", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
