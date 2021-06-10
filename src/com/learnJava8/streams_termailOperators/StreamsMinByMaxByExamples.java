package com.learnJava8.streams_termailOperators;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExamples {


    public static Optional<Student>min_By()
    {
        return StudentDatabase.getAllStudents().stream().collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {

        System.out.println("minBy : "+min_By());
    }
}
