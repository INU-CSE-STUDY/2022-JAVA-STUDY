package inu.cse.ch06.uuuo3o;

class Tv {
    // 멤버 변수
    String color;   // 색상
    boolean power;  // 전원 상태 (ON/OFF)
    int channel;    // 채널

    // 메소드
    void power() { power = !power; }    // TV를 켜거나 끄는 기능을 하는 메소드
    void channelUp() { ++channel; }     // TV의 채널을 높이는 기능을 하는 메소드
    void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메소드
}

public class TvTest {
    public static void main(String[] args) {
        Tv t;               // Tv 인스턴스를 참조하기 위한 변수 t 선언
        t = new Tv();       // Tv 인스턴스 생성
        t.channel = 7;      // 멤버변수 channel의 값을 7로 선언
        t.channelDown();    // 메소드 channelDown() 호출

        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}
