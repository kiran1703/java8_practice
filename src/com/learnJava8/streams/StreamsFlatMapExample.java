package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;
import com.sun.security.jgss.GSSUtil;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

public static List<String> printStudentActivites()
{
    long start=System.currentTimeMillis();
    List<String> studentActivities=StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(toList());
    long end=System.currentTimeMillis();
    System.out.println("Duration when run in sequence : "+(end-start));
    return studentActivities;
}

    public static List<String> printStudentActivitesParallel()
    {
        long start=System.currentTimeMillis();
        List<String> studentActivities=StudentDatabase.getAllStudents().parallelStream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(toList());
        long end=System.currentTimeMillis();
        System.out.println("Duration when run in parallel : "+(end-start));
        return studentActivities;
    }

    public static long printStudentActivitiesCount()
    {


        long ActivityCount=StudentDatabase.getAllStudents().
                stream().map(Student::getActivities).flatMap(List::stream)
                .distinct().count();

        return ActivityCount;
    }


    public static void main(String[] args) {
        printStudentActivites();
        printStudentActivitesParallel();

    }
}
