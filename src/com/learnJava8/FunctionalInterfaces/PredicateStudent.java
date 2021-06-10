package com.learnJava8.FunctionalInterfaces;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudent {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 9;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 7.5;

    public static void filterStudentByGradeLevel() {

        System.out.println("---------------------");

        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((i) -> {

            if (p1.test(i)) {
                System.out.println(i);
            }
        });

    }

    public static void filterStudentByGpaLevel() {
        System.out.println("---------------------");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((i) -> {

            if (p2.test(i)) {
                System.out.println(i);
            }
        });

    }

    public static void filterStudentByGradeAndGpaLevel(){
        System.out.println("----------filtered using and-----------");
        List<Student> studentList=StudentDatabase.getAllStudents();
        studentList.forEach((i)->{

            if( p1.and(p2).test(i))
            {
                System.out.println(i);
            }
        });

    }

    public static void main(String[] args) {


        filterStudentByGradeLevel();
        filterStudentByGpaLevel();
        filterStudentByGradeAndGpaLevel();

    }


}
