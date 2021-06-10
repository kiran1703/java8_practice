package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsMapExample {

public static List<String> namesList()
    {
       List<String>StudentList= StudentDatabase.getAllStudents().stream()
                //Student object to String object
                .map(Student::getName).map(String::toUpperCase).collect(toList());

       return  StudentList;
    }
    public static void main(String[] args) {

        System.out.println(namesList());

    }
}
