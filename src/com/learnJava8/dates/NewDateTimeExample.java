package com.learnJava8.dates;

import java.time.LocalDate;
import java.time.LocalTime;

public class NewDateTimeExample {

    public static void main(String[] args) {
       LocalDate date= LocalDate.now();
        System.out.println("LocalDate : "+date);

        LocalTime time= LocalTime.now();
        System.out.println("LocalTime : "+time);
    }
}
