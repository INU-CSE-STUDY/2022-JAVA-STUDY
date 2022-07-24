package inu.cse.ch14.hgyellow;

import java.util.*;
import java.util.stream.*;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student541> Student54Stream = Stream.of(
                new Student541("이자바", 3, 300),
                new Student541("김자바", 1, 200),
                new Student541("안자바", 2, 100),
                new Student541("박자바", 2, 150),
                new Student541("소자바", 1, 200),
                new Student541("나자바", 3, 290),
                new Student541("감자바", 3, 180)
        );

        Student54Stream.sorted(Comparator.comparing(Student541::getBan).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
    }
}

class Student541 implements Comparable<Student541> {
    String name;
    int ban;
    int totalScore;

    Student541(String name, int ban, int totalScore) {
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

    public int compareTo(Student541 s) {
        return s.totalScore - this.totalScore;
    }
}