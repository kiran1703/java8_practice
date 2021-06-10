package com.learnJava8.FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

 static UnaryOperator<String>unaryOp=(s)->s.concat("Default");


    public static void main(String[] args) {

        System.out.println(unaryOp.apply("jave 8 "));

    }
}
