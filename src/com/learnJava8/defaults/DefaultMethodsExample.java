package com.learnJava8.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {


    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("Adam","vinay","john","alex");

        //before java8
//        Collections.sort(stringList);
//        System.out.println(stringList);

        //after java8
        stringList.sort(Comparator.naturalOrder());
        System.out.println(stringList);

    }
}
