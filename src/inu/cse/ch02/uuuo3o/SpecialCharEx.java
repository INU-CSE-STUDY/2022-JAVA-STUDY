package inu.cse.ch02.uuuo3o;

public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');               // ''' 이렇게 못씀
        System.out.println("abc\t123\b456");    // \b에 의해 3이 지워짐
        System.out.println('\n');               // 개행 문자 출력하고 개행
        System.out.println("\"Hello\"");        // 큰 따옴표 출력하고 싶으면 위에 작은 따옴표처럼
        System.out.println("c:\\");
    }
}
