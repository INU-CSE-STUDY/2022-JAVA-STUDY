package inu.cse.ch03.uuuo3o;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);

        // 결과를 비교하기 위해 i와 j의 값을 다시 초기 상태로 변경.
        i = 5;
        j = 0;

        j = ++i;
        System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);
    }
}
