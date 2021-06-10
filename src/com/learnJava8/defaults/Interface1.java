package com.learnJava8.defaults;

public interface Interface1 {

    default void method_A()
    {
        System.out.println("Inside method A"+Interface1.class);
    }
}
