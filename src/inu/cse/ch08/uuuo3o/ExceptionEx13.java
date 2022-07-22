package inu.cse.ch08.uuuo3o;

public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1 메소드에서 에외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
