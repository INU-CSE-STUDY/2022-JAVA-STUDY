package inu.cse.ch14.hgyellow;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class StreamEx6 {
    public static void main(String[] args) {
        Student543[] stuArr = {
                new Student543("이자바", 3, 300),
                new Student543("김자바", 1, 200),
                new Student543("안자바", 2, 100),
                new Student543("박자바", 2, 150),
                new Student543("소자바", 1, 200),
                new Student543("나자바", 3, 290),
                new Student543("감자바", 3, 180)
        };

        List<String> names = Stream.of(stuArr).map(Student543::getName).collect(Collectors.toList());
        System.out.println(names);

        Student543[] stuArr2 = Stream.of(stuArr).toArray(Student543[]::new);

        for (Student543 s : stuArr2)
            System.out.println(s);

        Map<String, Student543> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s -> s.getName(), p -> p));
        for (String name : stuMap.keySet())
            System.out.println(name + "-" + stuMap.get(name));

        long count = Stream.of(stuArr).collect(counting());
        long totalScore = Stream.of(stuArr).collect(summingInt(Student543::getTotalScore));
        System.out.println("count=" + count);
        System.out.println("totalScore=" + totalScore);

        totalScore = Stream.of(stuArr).collect(reducing(0, Student543::getTotalScore, Integer::sum));
        System.out.println("totalScore=" + totalScore);

        Optional<Student543> topStudent54 = Stream.of(stuArr).collect(maxBy(Comparator.comparingInt(Student543::getTotalScore)));
        System.out.println("topStudent54=" + topStudent54.get());

        IntSummaryStatistics stat = Stream.of(stuArr).collect(summarizingInt(Student543::getTotalScore));
        System.out.println(stat);

        String stuNames = Stream.of(stuArr).map(Student543::getName).collect(joining(",", "{", "}"));
        System.out.println(stuNames);
    }
}

class Student543 implements Comparable<Student543> {
    String name;
    int ban;
    int totalScore;

    Student543(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return totalScore;
    }

    public int compareTo(Student543 s) {
        return s.totalScore - this.totalScore;
    }
}