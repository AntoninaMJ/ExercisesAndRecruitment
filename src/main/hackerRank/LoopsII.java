package main.hackerRank;

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
            int potega = 1;
            for (int j = 1; j < n; j++) {
                potega = 2 * potega;
                intResult = intResult + potega * b;
                stringResult = stringResult + " " + intResult;
            }
            System.out.println(stringResult);
        }
        in.close();
    }
}
