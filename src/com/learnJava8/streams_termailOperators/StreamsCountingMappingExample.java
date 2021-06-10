package com.learnJava8.streams_termailOperators;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;
import org.w3c.dom.ls.LSOutput;

import java.util.List;


import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsCountingMappingExample {


    public static void main(String[] args) {

        List<String> namesList = StudentDatabase.getAllStudents().stream().collect(mapping(Student::getName, toList()));
        System.out.println(namesList);
    }
}
