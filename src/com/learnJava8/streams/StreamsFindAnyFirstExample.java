package com.learnJava8.streams;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

public static Optional<Student> findAny()
{
    return StudentDatabase.getAllStudents().stream().filter(s->s.getGpa()>=7.5).findAny();
}

    public static Optional<Student> findFirst()
    {
        return StudentDatabase.getAllStudents().stream().filter(s->s.getGpa()>=7.5).findFirst();
    }

    public static void main(String[] args) {

    Optional<Student>findAnyEg=findAny();
    if (findAnyEg.isPresent())
    {
        System.out.println("find Any : "+findAnyEg.get());
    }
        Optional<Student>findFirstEg=findFirst();
        if (findFirstEg.isPresent())
        {
            System.out.println("find first : "+findFirstEg.get());
        }

    }
}
