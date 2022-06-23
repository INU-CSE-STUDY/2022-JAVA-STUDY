package inu.cse.ch03.uuuo3o;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;  // 1,000,000
        int b = 2_000_000;

        // int형을 곱한 뒤에 long으로 바꾸는 거라 int 범위 넘겨서 음수값 출력
        // 할 거면 (long)a * b; 이런 식으로 해야 함
        long c = a * b;
        System.out.println(c);
    }
}
