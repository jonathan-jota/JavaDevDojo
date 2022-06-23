package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "João";
        String numeros = "012345";
        String nameWithSpace = " José    ";
        System.out.println(nome.charAt(2));
        System.out.println(nome.length());
        System.out.println(nome.replace("o", "e"));

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2));
        System.out.println(numeros.substring(2));
        System.out.println(numeros.substring(1, numeros.length()));

        System.out.println(nameWithSpace.trim());
    }
}
