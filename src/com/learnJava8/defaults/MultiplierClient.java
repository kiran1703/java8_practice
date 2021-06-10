package com.learnJava8.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {


    public static void main(String[] args) {
        Multiplier multiplier=new MultiplierImpl();
        List<Integer> integerList= Arrays.asList(1,5,8);
        System.out.println(multiplier.multiply(integerList));
        System.out.println("Default method size is : "+multiplier.size(integerList));

        System.out.println("Static method can only be accessed using Classname/InterfaceName : "+Multiplier.isEmpty(integerList));
    }
}
