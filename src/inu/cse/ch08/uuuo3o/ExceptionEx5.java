package inu.cse.ch08.uuuo3o;

public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);      // 실행 X
        } catch (ArithmeticException e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
