package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
         *  . - 123, 133, 1A3,1@3
         */

        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";

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
