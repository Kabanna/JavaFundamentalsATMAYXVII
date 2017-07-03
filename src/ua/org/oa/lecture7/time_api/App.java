package ua.org.oa.lecture7.time_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Created by dmitr on 03.07.2017.
 */
public class App {
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println("now time = " + nowTime);

        LocalDateTime ldt = LocalDateTime.of(2017, 5, 25, 18, 30, 15);
        System.out.println("time = " + ldt);

        FormatStyle dateTimeStyle = FormatStyle.SHORT;
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(dateTimeStyle);
        String localTime = ldt.format(formatter);
        System.out.println("localTime = " + localTime);


        String pattern = "MMMM/dd/yyyy a hh:mm";
        formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        localTime = nowTime.format(formatter);
        System.out.println("localTime = " + localTime);

        LocalDateTime parsDate = LocalDateTime.parse(localTime, formatter);
        System.out.println("parsDate = " + parsDate.plusDays(1));
        long start = System.nanoTime();

        for (int i = 0; i < 100; i++) {
            Math.cos(i);
        }

        long finish = System.nanoTime();

        System.out.println("finish - start = " + (finish - start)/10e9);
    }
}
