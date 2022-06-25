package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        //LocalDate date = LocalDate.of(2022, Month.SEPTEMBER, 25);
        LocalDate date = LocalDate.parse("2022-09-25");
        //LocalTime time = LocalTime.of(8, 30, 10);
        LocalTime time = LocalTime.parse("08:30:10");
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
