package com.learnJava8.streams_termailOperators;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class StreamsGroupingByType1 {


    public static Map<String,List<Student>> groupingStudentsByGender()
    {
     return  StudentDatabase.getAllStudents().stream().collect(groupingBy(Student::getGender));
    }

    public static Map<String,List<Student>> groupingStudentsByGpa()
    {
        return  StudentDatabase.getAllStudents().stream().collect(groupingBy(s->s.getGpa()>=8 ? "Outstanding" : "Average"));
    }

    public static Map<Integer,Map<String,List<Student>>> doubleGroupingStudents()
    {
        return  StudentDatabase.getAllStudents().stream().collect(groupingBy(s->s.getGradeLevel(),groupingBy(s->s.getGpa()>=8 ? "Outstanding" : "Average")));
    }

    public static Map<Integer,Integer> doubleGroupingStudents_2()
    {
        return  StudentDatabase.getAllStudents().stream().collect(groupingBy(s->s.getGradeLevel(),summingInt(Student::getNoteBooks)));
    }

    public static void main(String[] args) {
//        System.out.println("\n"+groupingStudentsByGender());
//        System.out.println("\n"+groupingStudentsByGpa());
        System.out.println("\n"+doubleGroupingStudents_2());


    }


}
