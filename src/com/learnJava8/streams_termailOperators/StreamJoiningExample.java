package com.learnJava8.streams_termailOperators;

import com.learnJava8.data.StudentDatabase;

import java.util.stream.Collectors;

public class StreamJoiningExample {

    public static String joining_1()
    {
       return StudentDatabase.getAllStudents().stream().map(s->s.getName()).collect(Collectors.joining());
    }

    public static String joining_2()
    {
        return StudentDatabase.getAllStudents().stream().map(s->s.getName()).collect(Collectors.joining("-"));
    }

    public static String joining_3()
    {
        return StudentDatabase.getAllStudents().stream().map(s->s.getName()).collect(Collectors.joining("-","(",")"));
    }


    public static void main(String[] args) {

        System.out.println("joining_1 : "+joining_1());
        System.out.println("joining with delimiter : "+joining_2());
        System.out.println("joining with delimiter,prefix and suffix : "+joining_3());



    }
}
