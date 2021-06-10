package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static List<Student> studentSortedByName()
    {
        return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(studentSortedByName());
    }
}
