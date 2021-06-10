package com.learnJava8.optional;

import com.learnJava8.data.Bike;
import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.Optional;

public class OptionalFilterMapExample {

    public static void filer()
    {
        Optional<Student>studentOptional= Optional.ofNullable(StudentDatabase.studentSupplier.get());

        studentOptional.filter(s->s.getGpa()>=7.5).ifPresent(s-> System.out.println(s));

    }

    public static void OptionalMap()
    {
        Optional<Student>studentOptional= Optional.ofNullable(StudentDatabase.studentSupplier.get());

        studentOptional.filter(s->s.getGpa()>=7.5).map(s->s.getName()).ifPresent(s-> System.out.println(s));

    }

    public static void OptionalFlatMap()
    {
        Optional<Student>studentOptional= Optional.ofNullable(StudentDatabase.studentSupplier.get());

        Optional<String> name=studentOptional.filter(s->s.getGpa()>=7)//Optional<Student Optional<Bike>>
                .flatMap(Student::getBike)//Optional<Bike>
                .map(Bike::getName);//if we need to get inside a optional object inside a optional object then flatMap should be used

        name.ifPresent(s-> System.out.println(s));
    }


    public static void main(String[] args) {
        OptionalMap();
        filer();
        OptionalFlatMap();

    }
}
