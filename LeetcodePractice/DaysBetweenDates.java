package LeetcodePractice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
    public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        String date1 = "2019-06-29", date2 = "2019-06-30";
        System.out.println(daysBetweenDates(date1, date2)); 
        date1 = "2020-01-15"; date2 = "2019-12-31";
        System.out.println(daysBetweenDates(date1, date2));
    }
}

