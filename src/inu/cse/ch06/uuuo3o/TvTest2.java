package inu.cse.ch06.uuuo3o;

class Tv2 {
    String color;   // 색상
    boolean power;  // 전원 상태 (ON/OFF)
    int channel;    // 채널

    void power() { power = !power; }    // TV를 켜거나 끄는 기능을 하는 메소드
    void channelUp() { ++channel; }     // TV의 채널을 높이는 기능을 하는 메소드
    void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메소드
}

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
    }
}
