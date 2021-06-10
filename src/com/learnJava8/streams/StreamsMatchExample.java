package com.learnJava8.streams;

import com.learnJava8.data.StudentDatabase;

public class StreamsMatchExample {

public static boolean allmatch()
{
     return StudentDatabase.getAllStudents().stream().allMatch(student->student.getGpa()>=7);
}

    public static boolean anymatch()
    {
        return StudentDatabase.getAllStudents().stream().anyMatch(student->student.getGpa()>=8);
    }

    public static boolean nonematch()
    {
        return StudentDatabase.getAllStudents().stream().noneMatch(student->student.getGpa()>=8);
    }


    public static void main(String[] args) {

        System.out.println("Result of all match : "+allmatch());
        System.out.println("Result of any match : "+anymatch());
        System.out.println("Result of any match : "+nonematch());

    }
}
