package com.learnJava8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

public static Optional<Integer> limit(List<Integer> integerList)
{
    return integerList.stream().limit(2).reduce(Integer::sum);
}

    public static Optional<Integer> skip(List<Integer> integerList)
    {
        return integerList.stream().skip(2).reduce(Integer::sum);
    }
    public static void main(String[] args) {

    List<Integer>integerList= Arrays.asList(1,4,6,8,10);
        System.out.println(limit(integerList).get());

        System.out.println(skip(integerList).get());
    }
}
