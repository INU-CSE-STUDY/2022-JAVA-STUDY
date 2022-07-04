package inu.cse.ch08.hgyellow;

public class ExceptionEx2 {
    public static void main(String args[]) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = number / (int) (Math.random() * 10); // 7¹øÂ° ¶óÀÎ
            System.out.println(result);
        }
    }
}
