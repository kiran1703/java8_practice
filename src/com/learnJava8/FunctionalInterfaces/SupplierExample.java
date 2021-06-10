package com.learnJava8.FunctionalInterfaces;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student>studentSupplier=()->
        {
            return new Student("vinitha",8,8.0,"Female", Arrays.asList("swimming", "gymnastics","soccer"),30);
        };

        Supplier<List<Student>>listSupplier=()-> StudentDatabase.getAllStudents();

        System.out.println(studentSupplier.get());

        System.out.println(listSupplier.get());
    }
}
