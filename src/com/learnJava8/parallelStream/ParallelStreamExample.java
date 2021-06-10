package com.learnJava8.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformance(Supplier<Integer>supplier,int noOfTimes)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<noOfTimes;i++)
        {
            supplier.get();
        }
        long end = System.currentTimeMillis();
        return end-start;

    }

    public static int sumSequentialStream()
    {
        return IntStream.rangeClosed(1,1000000).sum();
    }

    public static int sumParallelStream()
    {
        return IntStream.rangeClosed(1,1000000).parallel().sum();
    }

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("Result of sequential : "+checkPerformance(ParallelStreamExample::sumSequentialStream,20));

        System.out.println("Result of parallel : "+checkPerformance(ParallelStreamExample::sumParallelStream,20));

    }
}
