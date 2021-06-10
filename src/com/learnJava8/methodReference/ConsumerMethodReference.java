package com.learnJava8.methodReference;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<Student>c1=System.out::println;

    //instance method Reference
    //className::InstanceMethodName
    static Consumer<Student>c2=Student::printListOfActivites;


    public static void main(String[] args) {

        StudentDatabase.getAllStudents().forEach(c1);

        StudentDatabase.getAllStudents().forEach(c2);

    }
}
