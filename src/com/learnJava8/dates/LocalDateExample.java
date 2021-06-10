package com.learnJava8.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("LocalDate : " + date);

        LocalDate date1=LocalDate.of(2021,04,30);
        System.out.println("date1 : "+date1);

        LocalDate date2=LocalDate.ofYearDay(2021,120);
        System.out.println("date2 : "+date2);

        System.out.println(date.getDayOfMonth());

        System.out.println("Day of the month using get : "+date.get(ChronoField.DAY_OF_MONTH));

        //Modifying local date

        System.out.println("added days : "+date.plusDays(2));
        System.out.println("subtracted days : "+date.minusDays(2)); /* this will take the first created date object which will be pointing to the current date
        and not the altered one just before*/
        System.out.println(date.isEqual(date1));


    }
}
