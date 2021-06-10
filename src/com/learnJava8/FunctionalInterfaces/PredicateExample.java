package com.learnJava8.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> evenOrNot = (i) -> {return  i%2==0;};
    static Predicate<Integer>p2= (i) ->i%2==0;
    static Predicate<Integer>p3= (i) ->i/5==0;

    public static void predicateAnd(int a)
    {
        System.out.println("Predicate And result is : "+p2.and(p3).test(a));

    }

    public static void predicateOr(int a)
    {
        System.out.println("Predcate OR result is : "+p2.or(p3).test(a));
    }

    public static void predicateNegate(int a)
    {
        System.out.println("Predicate Negate result is : "+p2.or(p3).negate().test(a));
    }
    public static void main(String[] args) {



        System.out.println(evenOrNot.test(4));


        p2.test(5);

        if(p2.test(5)==false)
        {
            System.out.println("odd number");
        }

        predicateAnd(10);
        predicateOr(10);
        predicateNegate(10);



    }
}
