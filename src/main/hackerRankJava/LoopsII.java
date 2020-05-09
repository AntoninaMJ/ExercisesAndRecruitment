package main.hackerRankJava;

import java.util.Scanner;

public class LoopsII {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int intResult = a + b;
            String stringResult = String.valueOf(intResult);

            for (int j = 1; j < n; j++) {
                intResult = (int) (intResult + Math.pow(2, j) * b);
                stringResult = stringResult + " " + intResult;
            }
            System.out.println(stringResult);
        }
        in.close();
    }
}
