package com.learnJava8.methodReference;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethodReference {

static Predicate<Student> p1=RefactorMethodReference::greaterThanGradeLevel;

public static boolean greaterThanGradeLevel(Student s)
{
    return s.getGradeLevel()>=8;
}

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
    }
}
