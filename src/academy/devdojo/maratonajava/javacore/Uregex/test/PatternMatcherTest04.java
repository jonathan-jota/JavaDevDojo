package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        /**
         *  \d - Todos os dígitos
         *  \D - Tudo que não for dígito
         *  \s - Espaços em branco \t \n \r \f
         *  \S - Todos os caracteres exceto em branco
         *  \w - a-zA-Z, digitos
         *  \W - Tudo que não for \w
         *  [] - Range ou intervalo
         *  ? - Zerou ou uma ocorrência
         *  * - Zero ou mais de uma
         *  + - Uma ou mais ocorrências
         *  {n,m} - de n até m
         *  () - agrupamento
         *  | - exemplo: o(v/c)o -> ovo ou oco
         *  $ - fim da linha
         */

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "0x 0X 0xFFFED 0x10G 0X456 0x200";

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
