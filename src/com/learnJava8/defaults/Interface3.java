package com.learnJava8.defaults;

public interface Interface3 extends Interface2 {

    default void method_C()
    {
        System.out.println("Inside method C");
    }
}
