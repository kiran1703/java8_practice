package com.learnJava8.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {


    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2021,04,30);
        LocalDate ld1=LocalDate.of(2021,05,13);

        Period p1=ld.until(ld1);
        System.out.println(p1.getDays());
        System.out.println(p1.getMonths());
        System.out.println(p1.getYears());

        Period p2=Period.ofDays(50);
        Period p3=Period.ofMonths(10);
        Period p4=Period.ofYears(10);
        System.out.println("period of days in months :"+p2.getDays());
        System.out.println("period of years in months :"+p4.toTotalMonths());
    }
}
