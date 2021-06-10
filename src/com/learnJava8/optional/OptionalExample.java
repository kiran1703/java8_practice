package com.learnJava8.optional;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName()
    {
//       Student s= StudentDatabase.studentSupplier.get();
        Student s= null;
       if(s!=null)
       {
           return s.getName();
       }
       else
       {
           return null;
       }

    }

    public static Optional<String> getStudentNameOptional()
    {
       Optional<Student> studentOptional= Optional.ofNullable(StudentDatabase.studentSupplier.get());
//        Student s= null;
        if(studentOptional.isPresent())
        {
            return studentOptional.map(s->s.getName());//this will return Optional<String>
        }
        else
        {
            return Optional.empty();//represents Optional obj with no values
        }

    }


    public static void main(String[] args) {

      /*String name=  getStudentName();
      if (name!=null)
        System.out.println("Length of Student name: "+name.length());
      else
      {
          System.out.println("Name not found");
      }*/
        Optional<String>studentOptional = getStudentNameOptional();
        if (studentOptional.isPresent())
        {
            System.out.println(studentOptional.get().length());
        }
    }
}
