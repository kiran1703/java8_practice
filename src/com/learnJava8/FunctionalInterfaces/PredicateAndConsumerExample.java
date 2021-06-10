package com.learnJava8.FunctionalInterfaces;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Student> p1=(s)->s.getGradeLevel()>=8;
    Predicate<Student> p2=(s)->s.getGpa()>=8;

    BiPredicate<Integer,Double>Bip=(grade,gpa)->grade>=8 && gpa>=8;
    BiConsumer<String, List<String>> studentBiConsumer= (name, activites)-> System.out.println("name is : "+name+" : "+activites);

    Consumer<Student> c1=(studentConsumer)->{
        if(Bip.test(studentConsumer.getGradeLevel(),studentConsumer.getGpa()))
//        if(p1.and(p2).test(studentConsumer))
        {
            studentBiConsumer.accept(studentConsumer.getName(),studentConsumer.getActivities());
        }
    };

    public void printNameAndActivites(List<Student>students)
    {
students.forEach(c1);

    }

    public static void main(String[] args) {
        List<Student>studentList= StudentDatabase.getAllStudents();

       new PredicateAndConsumerExample().printNameAndActivites(studentList);




    }
}
