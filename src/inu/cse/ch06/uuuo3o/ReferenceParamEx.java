package inu.cse.ch06.uuuo3o;

class Data2 { int x; }

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        change(d);
        System.out.println("After change(d.x)");
        System.out.println("main(): x = " + d.x);
    }

    static void change(Data2 d) { // 참조형 매개변수, 값이 저장된 주소를 전달하는 것으로 변경까지 가능
        d.x = 1000;
        System.out.println("change(): x = " + d.x);
    }
}
