package academy.devdojo.maratonajava.javacore.Sformatacao.test;
/**
 *  Format = Transforma de um objeto para um string
 *  Parse = Transforma de uma string para um objeto
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20220626", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("26/06/2022", formatterBR);
        System.out.println(parseBR);
    }
}
