package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        /**
         *  \d - Todos os dígitos
         *  \D - Tudo que não for dígito
         *  \s - Espaços em branco \t \n \r \f
         *  \S - Todos os caracteres exceto em branco
         *  \w - a-zA-Z, digitos
         *  \W - Tudo que não for \w
         *  [] - Range ou intervalo
         */
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-zA-Z]";
        String texto = "0x 0X 0xFFFED 0x1 0X456 0x200";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+ matcher.group() + "\n");
        }

    }
}
