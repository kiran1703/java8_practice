package com.learnJava8.defaults;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultsMethodExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(s -> s.getName());
    static Comparator<Student> gradeComparator = Comparator.comparing(s -> s.getGradeLevel());

    public static void sortByName(List<Student> studentList) {


        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> studentList) {


        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {

Comparator<Student>nullComparator=Comparator.nullsFirst(nameComparator);
        studentList.sort(nullComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDatabase.getAllStudents();

//        studentList.forEach(studentConsumer);

        System.out.println("------------");

//        sortByName(studentList);
//        comparatorChaining(studentList);
        sortWithNullValues(studentList);

    }
}
