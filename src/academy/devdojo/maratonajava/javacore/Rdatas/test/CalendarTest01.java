package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if ( c.getFirstDayOfWeek() == Calendar.SUNDAY) {
        System.out.println("Domingão");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 6);
        c.roll(Calendar.HOUR, 12);

        Date date = c.getTime();
        System.out.println(date);
    }
}
