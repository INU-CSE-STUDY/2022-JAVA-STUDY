package inu.cse.ch14.hgyellow;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

public class StreamEx7 {
    public static void main(String[] args) {
        Student54[] stuArr = {
                new Student54("나자바", true, 1, 1, 300),
                new Student54("김지미", false, 1, 1, 250),
                new Student54("김자바", true, 1, 1, 200),
                new Student54("이지미", false, 1, 2, 150),
                new Student54("남자바", true, 1, 2, 100),
                new Student54("안지미", false, 1, 2, 50),
                new Student54("황지미", false, 1, 3, 100),
                new Student54("강지미", false, 1, 3, 150),
                new Student54("이자바", true, 1, 3, 200),

                new Student54("나자바", true, 2, 1, 300),
                new Student54("김지미", false, 2, 1, 250),
                new Student54("김자바", true, 2, 1, 200),
                new Student54("이지미", false, 2, 2, 150),
                new Student54("남자바", true, 2, 2, 100),
                new Student54("안지미", false, 2, 2, 50),
                new Student54("황지미", false, 2, 3, 100),
                new Student54("강지미", false, 2, 3, 150),
                new Student54("이자바", true, 2, 3, 200)
        };

        System.out.printf("1. 단순분할(성별로 분할)%n");
        Map<Boolean, List<Student54>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student54::isMale));

        List<Student54> maleStudent54 = stuBySex.get(true);
        List<Student54> femaleStudent54 = stuBySex.get(false);

        for (Student54 s : maleStudent54) System.out.println(s);
        for (Student54 s : femaleStudent54) System.out.println(s);

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수)%n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student54::isMale, counting()));

        System.out.println("남학생 수 :" + stuNumBySex.get(true));
        System.out.println("여학생 수 :" + stuNumBySex.get(false));


        System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
        Map<Boolean, Optional<Student54>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student54::isMale,
                        maxBy(comparingInt(Student54::getScore))
                ));
        System.out.println("남학생 1등 :" + topScoreBySex.get(true));
        System.out.println("여학생 1등 :" + topScoreBySex.get(false));

        Map<Boolean, Student54> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student54::isMale,
                        collectingAndThen(
                                maxBy(comparingInt(Student54::getScore)), Optional::get
                        )
                ));
        System.out.println("남학생 1등 :" + topScoreBySex2.get(true));
        System.out.println("여학생 1등 :" + topScoreBySex2.get(false));

        System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");

        Map<Boolean, Map<Boolean, List<Student54>>> failedStuBySex =
                Stream.of(stuArr).collect(partitioningBy(Student54::isMale,
                        partitioningBy(s -> s.getScore() <= 100))
                );
        List<Student54> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student54> failedFemaleStu = failedStuBySex.get(false).get(true);

        for (Student54 s : failedMaleStu) System.out.println(s);
        for (Student54 s : failedFemaleStu) System.out.println(s);
    }
}

class Student54 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student54(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName() {
        return name;
    }

    boolean isMale() {
        return isMale;
    }

    int getHak() {
        return hak;
    }

    int getBan() {
        return ban;
    }

    int getScore() {
        return score;
    }

    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]",
                name, isMale ? "남" : "여", hak, ban, score);
    }

    enum Level {HIGH, MID, LOW}
}