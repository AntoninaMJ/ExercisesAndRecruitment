package main.hackerRank;

import java.util.Scanner;

public class IfElseProblem {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String weird = "Weird";
        String notWeird = "Not Weird";

        if (N % 2 != 0) {
            System.out.println(weird);
        } else if (N <= 5) {
            System.out.println(notWeird);
        } else if (N <= 20) {
            System.out.println(weird);
        } else {
            System.out.println(notWeird);
        }
        scanner.close();
    }
}


//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird 2-5
//If  is even and in the inclusive range of  to , print Weird 6-20
//If  is even and greater than , print Not Weird 20