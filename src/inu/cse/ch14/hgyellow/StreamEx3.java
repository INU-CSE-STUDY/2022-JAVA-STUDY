package inu.cse.ch14.hgyellow;

import java.util.*;
import java.util.stream.*;

public class StreamEx3 {
    public static void main(String[] args) {
        Student542[] stuArr = {
                new Student542("이자바", 3, 300),
                new Student542("김자바", 1, 200),
                new Student542("안자바", 2, 100),
                new Student542("박자바", 2, 150),
                new Student542("소자바", 1, 200),
                new Student542("나자바", 3, 290),
                new Student542("감자바", 3, 180)
        };

        Stream<Student542> stuStream = Stream.of(stuArr);

        stuStream.sorted(Comparator.comparing(Student542::getBan)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        stuStream = Stream.of(stuArr);
        IntStream stuScoreStream = stuStream.mapToInt(Student542::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("count=" + stat.getCount());
        System.out.println("sum=" + stat.getSum());
        System.out.printf("average=%.2f%n", stat.getAverage());
        System.out.println("min=" + stat.getMin());
        System.out.println("max=" + stat.getMax());
    }
}

class Student542 implements Comparable<Student542> {
    String name;
    int ban;
    int totalScore;

    Student542(String name, int ban, int totalScore) {
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

    public int compareTo(Student542 s) {
        return s.totalScore - this.totalScore;
    }
}