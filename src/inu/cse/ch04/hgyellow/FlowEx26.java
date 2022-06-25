package inu.cse.ch04.hgyellow;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while ((sum += ++i) <= 100)
            System.out.printf("%-2d-%d%n", i, sum);
    }
}
