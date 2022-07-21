package inu.cse.ch07.uuuo3o;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;  // 외부 클래스의 private 멤버 접근 가능
        int iiv2 = outerCv;
    }

    static class StaticInner {
//        int siv = outerIv; // 외부 클래스의 멤버에 접근 불가능
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;

            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
