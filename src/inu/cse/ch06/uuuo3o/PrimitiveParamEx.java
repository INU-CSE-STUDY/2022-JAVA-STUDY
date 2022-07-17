package inu.cse.ch06.uuuo3o;

class Data { int x; }

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main(): x = " + d.x);
    }

    static void change(int x) { // 기본형 매개변수, 변수에 저장된 값만 읽을 수 있을 뿐 변경할 수는 없음
        x = 1000;
        System.out.println("change(): x = " + x);
    }
}
