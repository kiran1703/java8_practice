package com.learnJava8.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

   static Function<String,String>func1=(firstNum)->firstNum.toUpperCase().concat(" apply method result");


    static Function<String,String>func2=(firstNum)->firstNum.toLowerCase().concat("kokki kumaru");
    public static void main(String[] args) {

        System.out.println("Result is : "+func1.apply("kiran"));
        System.out.println("Result of andThen is : "+func1.andThen(func2).apply("and Then "));

        System.out.println("Result of Compose is : "+func1.compose(func2).apply("CoMpOsE "));

    }
}
