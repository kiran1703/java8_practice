package com.learnJava8.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
       IntStream intStream= IntStream.range(1,50);
       IntStream rangeCloseStream=IntStream.rangeClosed(1,50);
        System.out.println("Sum of numbers using Range : "+intStream.sum());
        System.out.println("Range Count : "+IntStream.range(1,50).count());

        System.out.println("\nSum of numbers using Range : "+rangeCloseStream.sum());
       IntStream.rangeClosed(1,50).forEach((s-> System.out.print(s+",")));
        System.out.println("Range Count : "+IntStream.rangeClosed(1,50).count());
        OptionalInt optionalInt=IntStream.rangeClosed(0,10).max();
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);
    }
}
