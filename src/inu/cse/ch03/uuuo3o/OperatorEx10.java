package inu.cse.ch03.uuuo3o;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a;    // 얘는 곱하면서 오버플로우가 발생해버려서 값이 1000000이 아닌 -727이 나옴.
        int result2 = a / a * a;    // 나누기를 먼저 연산함으로써 1 * 1000000이 되니까 오버플로우가 발생하지 않음

        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1);
        System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);
    }
}
