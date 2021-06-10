package com.learnJava8.FunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer>binaryOp=(s,t)-> (s*t);


//    static Comparator<Integer>comparator=(a,b)->a.compareTo(b);
    static BinaryOperator<Integer>maxBy=BinaryOperator.maxBy((a,b)->a.compareTo(b));
    static BinaryOperator<Integer>minBy=BinaryOperator.minBy((a,b)->a.compareTo(b));

    public static void main(String[] args) {
        System.out.println(binaryOp.apply(10,20));

        System.out.println("Result of maxBy is : "+maxBy.apply(1,2));

        System.out.println("Result of minBy is : "+minBy.apply(1,2));

    }
}
