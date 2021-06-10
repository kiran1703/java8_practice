package com.learnJava8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsGenerateIterateExample {


    public static void main(String[] args) {
        Supplier<Integer>integerSupplier= new Random()::nextInt;

        Stream<Integer> integerStream=Stream.of(1,5,7,20,54);
        integerStream.forEach(System.out::println);

        Stream.iterate(1,x->x*3).limit(10).forEach(System.out::println);

        Stream.generate(integerSupplier).forEach(System.out::println);

    }
}
