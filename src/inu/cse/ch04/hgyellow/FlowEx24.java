package inu.cse.ch04.hgyellow;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("자, 이제 카운트다운을 시작합니다.");

        while (i-- != 0) {
            System.out.println(i);

            for (int j = 0; j < 2000000000; j++);
        }

        System.out.println("GAME OVER");
    }
}
