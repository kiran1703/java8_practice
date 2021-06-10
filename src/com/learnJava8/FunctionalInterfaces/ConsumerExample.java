package com.learnJava8.FunctionalInterfaces;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c2 = (i) -> System.out.println(i);

    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());



    public static void printStudents() {


        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printActivities() {


        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
    }

   
    public static void printCondition() {


        System.out.println("----------condition---------");

        List<Student> studentList = StudentDatabase.getAllStudents();

        studentList.forEach((student -> {
            if (student.getGradeLevel() == 8) {
                c3.andThen(c4).accept(student);
            }
        }));

    }

    public static void main(String[] args) {
        Consumer<String> consumer = s ->
                System.out.println(s.toUpperCase());


        consumer.accept("java8");

        printStudents();
        printActivities();

        printCondition();
    }
}
