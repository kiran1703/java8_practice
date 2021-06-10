package com.learnJava8.streams_termailOperators;

import com.learnJava8.data.Student;
import com.learnJava8.data.StudentDatabase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class StreamsPartitioningBy {

    public static void PartitioningBy_1()
    {
      Map<Boolean, List<Student>>studentMap= StudentDatabase.getAllStudents().stream().collect(partitioningBy(s->s.getGpa()>=8));

        System.out.println(studentMap);
    }

    public static void main(String[] args) {
PartitioningBy_1();
    }
}
