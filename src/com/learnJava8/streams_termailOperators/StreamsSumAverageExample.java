package com.learnJava8.streams_termailOperators;

import com.learnJava8.data.StudentDatabase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAverageExample {


    public static int sum()
    {
       return StudentDatabase.getAllStudents().stream().collect(summingInt(s->s.getNoteBooks()));
    }

    public static Double avg()
    {
        return StudentDatabase.getAllStudents().stream().collect(averagingInt(s->s.getNoteBooks()));
    }


    public static void main(String[] args) {
        System.out.println("Summing Int result : "+sum());
    }
}
