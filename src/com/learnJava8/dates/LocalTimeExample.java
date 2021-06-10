package com.learnJava8.dates;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();

        System.out.println(localTime.toSecondOfDay());
        System.out.println(localTime);
        System.out.println(localTime.withHour(5));

    }
}
