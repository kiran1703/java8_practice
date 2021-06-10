package com.learnJava8.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class StreamsMinMaxExample {


    public static Integer maxValue(List<Integer>integerList) {
        return integerList.stream().reduce(0,(x,y)->x>y?x:y);

    }

    public static Optional<Integer> maxValueOptional(List<Integer>integerList) {
        return integerList.stream().reduce((x,y)->x>y?x:y);

    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 9, 4, 7, 6);
        List<Integer> emptyList = new ArrayList<>();

        System.out.println("----------");
        System.out.println("using non-Empty List : "+maxValue(integerList));
        System.out.println("usig Empty List : "+maxValue(emptyList));

        System.out.println("----------");

        Optional<Integer>maxValueOptional1=maxValueOptional(integerList);
        Optional<Integer>maxValueOptionalEmpty=maxValueOptional(emptyList);

        System.out.println("maxValueOptional using Non Empty List is : "+maxValueOptional1.get());
        if(maxValueOptionalEmpty.isPresent()) {
            System.out.println("maxValueOptionalEmpty using Empty List is " + maxValueOptionalEmpty.get());
        }
        else
        {
            System.out.println("Input List is Empty");
        }

        System.out.println("-------------");
        System.out.println("using non-Empty List"+maxValueOptional(integerList));
        System.out.println("using non-Empty List"+maxValueOptional(emptyList));
    }
}
