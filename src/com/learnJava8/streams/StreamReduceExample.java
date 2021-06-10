package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList)
    {
      return   integerList.stream().reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList)
    {
        return   integerList.stream().reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGpaStudent()
    {
      return StudentDatabase.getAllStudents().stream().reduce((s1,s2)->(s1.getGpa()>s2.getGpa()) ?s1 : s2);
    }


    public static void main(String[] args) {

        List<Integer>integerList= Arrays.asList(1,3,5,6,8);

        System.out.println(performMultiplication(integerList));

      Optional<Integer>result=performMultiplicationWithoutIdentity(integerList);

        System.out.println(result.isPresent());
        System.out.println(result.get());

        if(getHighestGpaStudent().isPresent())
        System.out.println(getHighestGpaStudent().get());

    }
}
