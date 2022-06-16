package inu.cse.ch03.uuuo3o;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;     // int 타입 연산이어서 오버플로우
        long b = 1_000_000 * 1_000_000L;    // long 타입 연산이어서 제대로 계산됨
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
