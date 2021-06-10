package com.learnJava8.methodReference;

import com.learnJava8.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

static Supplier<Student> ss=Student::new;

static Function<String,Student>sf=Student::new;
    public static void main(String[] args) {

        System.out.println(ss.get());
        System.out.println(sf.apply("abc"));
    }
}
