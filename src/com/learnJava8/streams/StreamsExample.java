package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> studentPredicate=(s)->s.getGradeLevel()>=8;
    static Predicate<Student> studentGpaPredicate=(s)->s.getGpa()>=8.5;

    public static void main(String[] args) {
        Map<String,List<String>> studentList=StudentDatabase.getAllStudents().stream().peek((s)-> System.out.println(s))
                .filter(studentPredicate).peek((s)-> System.out.println("after 1st filer: "+s)).filter(studentGpaPredicate).collect(Collectors.toMap(Student::getName,Student::getActivities));

        System.out.println(studentList);
    }
}
