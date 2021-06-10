package com.learnJava8.optional;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String OrElse()
    {
//        Optional<Student> studentOptional=Optional.ofNullable(StudentDatabase.studentSupplier.get());
        Optional<Student> studentOptional=Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElse("Default");

    }

    public static String OrElseGet()
    {
        Optional<Student> studentOptional=Optional.ofNullable(StudentDatabase.studentSupplier.get());
//        Optional<Student> studentOptional=Optional.ofNullable(null);
        return studentOptional.map(Student::getName).orElseGet(()->"Default");

    }


    public static void main(String[] args) {
        System.out.println(OrElse());
        System.out.println(OrElseGet());

    }
}
