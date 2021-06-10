package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

public class StreamMapReduceExample {

public static Integer getNumberofNoteBooks()
{
   return StudentDatabase.getAllStudents().stream().filter(s->s.getGender().equalsIgnoreCase("female")).map(Student::getNoteBooks).//reduce(0,(a,b)->a+b);
    reduce(0,Integer::sum);
}


    public static void main(String[] args) {

        System.out.println(getNumberofNoteBooks());

    }
}
