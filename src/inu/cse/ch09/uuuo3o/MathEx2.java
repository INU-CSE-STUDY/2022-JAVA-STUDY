package inu.cse.ch09.uuuo3o;

import static java.lang.Math.*;
import static java.lang.System.out;

public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        out.println("i = " + i);
        out.println("(-i) = " + (-i));

        try {
            out.printf("negateExact(%d) = %d%n", 10, negateExact(10));
            out.printf("negateExact(%d) = %d%n", -10, negateExact(-10));
            out.printf("negateExact(%d) = %d%n", i, negateExact(i));    // 예외발생
        } catch (ArithmeticException e) {
            // i를 long 타입으로 형변환
            out.printf("negateExact(%d) = %d%n", (long) i, negateExact((long) i));
        }
    }
}
