package inu.cse.ch09.uuuo3o;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        // 근데 data2.txt 파일이 지금 없으니 에러 뜸. 당연한거임
        Scanner sc = new Scanner(new File("data2.txt"));
        int sum = 0;
        int cnt = 0;

        while (sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + (double) sum / cnt);
    }
}
