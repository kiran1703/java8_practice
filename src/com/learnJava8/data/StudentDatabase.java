package com.learnJava8.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {

   public static Supplier<Student>studentSupplier  = ()->
    {
       Student student = new Student("sindhu",8,8.0,"Female",Arrays.asList("swimming", "gymnastics","soccer"),30);
       Bike bike=new Bike();
       bike.setName("ABC");
       bike.setModel("XYZ");
       student.setBike(Optional.ofNullable(bike));
       return student;
    };


    public static List<Student> getAllStudents()
    {
        //8th grade
        Student student1=new Student("sindhu",8,8.0,"Female",Arrays.asList("swimming", "gymnastics","soccer"),30);
        Student student2=new Student("kiran",8,7.5,"Male",Arrays.asList("swimming", "basketball","volleyball"),23);

        //9th grade
        Student student3=new Student("srini",9,8.5,"Male",Arrays.asList("swimming", "gymnastics","aerobics"),25);
        Student student4=new Student("thulasi",9,8.5,"Female",Arrays.asList("swimming", "gymnastics","soccer"),26);


        List<Student> students= Arrays.asList(student1,student2,student3,null);
        return students;

    }
}
