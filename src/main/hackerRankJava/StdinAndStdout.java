package main.hackerRankJava;

import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
//42
//3.1415
//Welcome to HackerRank's Java tutorials!