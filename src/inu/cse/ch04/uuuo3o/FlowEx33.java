package inu.cse.ch04.uuuo3o;

public class FlowEx33 {
    public static void main(String[] args) {
        // for 문에 Loop1이라는 이름을 붙임
        Loop1 : for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5)
                    break Loop1;
                /*
                    break;
                    continue Loop1;
                    continue;
                */
                System.out.println(i + " * " + j + " = " + (i * j));
            }   // i에 대한 반복문 종료
            System.out.println();
        }   // Loop1 종료
    }
}
