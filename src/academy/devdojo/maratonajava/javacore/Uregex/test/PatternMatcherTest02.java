package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        /**
         *  \d - Todos os dígitos
         *  \D - Tudo que não for dígito
         *  \s - Espaços em branco \t \n \r \f
         *  \S - Todos os caracteres exceto em branco
         *  \w - a-zA-Z, digitos
         *  \W - Tudo que não for \w
         */
        String regex = "\\d";
        String texto = "jd1J#$3@_ fd";

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
