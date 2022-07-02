package inu.cse.ch04.uuuo3o;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트다운을 시작합니다.");

        while (i-- != 0) {
            System.out.println(i);

            // 아무런 내용이 없는 빈 문장, 시간을 보내기 위함.
            for (int j = 0; j < 2_000_000_000; j++) {}
        }
        System.out.println("GAME OVER");
    }
}
