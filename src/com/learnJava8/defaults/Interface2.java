package com.learnJava8.defaults;

public interface Interface2 extends Interface1 {

    default void method_B()
    {
        System.out.println("Inside method B");
    }

    default void method_A()
    {
        System.out.println("Inside method A"+Interface2.class);
    }
}
