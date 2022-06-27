package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println((Month.JUNE.getValue()));

        LocalDate date = LocalDate.of(2022, Month.JUNE, 29);
        LocalDate agora = LocalDate.now();
        agora = agora.plusDays(2);

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); //Ano Bissexto?
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.ERA));
        System.out.println(date);
        System.out.println(agora);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
    }
}
