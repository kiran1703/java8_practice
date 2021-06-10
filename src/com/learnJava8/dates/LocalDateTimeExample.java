package com.learnJava8.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime ldt1=LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(ldt1);
    }
}
