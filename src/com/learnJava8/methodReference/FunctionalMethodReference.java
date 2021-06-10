package com.learnJava8.methodReference;

import java.util.function.Function;

public class FunctionalMethodReference {

static Function<String,String>FunctionLamba = (s) -> s.toUpperCase();

static Function<String,String>FunctionReference =String::toUpperCase;
    public static void main(String[] args) {

        System.out.println(FunctionLamba.apply("dont give up"));

        System.out.println(FunctionReference.apply("kiran"));

    }
}
