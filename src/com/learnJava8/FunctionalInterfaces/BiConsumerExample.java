package com.learnJava8.FunctionalInterfaces;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities()
    {
        BiConsumer<String, List<String>> nameAndActivity=(name, activities)->
        {
            System.out.println("name is "+name+" and the activities are "+activities);
        };
        List<Student> StudentList= StudentDatabase.getAllStudents();
StudentList.forEach((student -> nameAndActivity.accept(student.getName(),student.getActivities())));
    }

    public static void main(String[] args) {
        BiConsumer<String,String>biconsume=(a,b)-> System.out.println(a+b);
        biconsume.accept("Kiran","Kumar");

        BiConsumer<Integer,Integer>multily=(a,b)-> System.out.println(a*b);
        BiConsumer<Integer,Integer>division=(a,b)-> System.out.println(a/b);

        multily.andThen(division).accept(10,5);

        nameAndActivities();
    }
}
