package main.codilityTests.test6;

import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        Distinct distinct = new Distinct();
        int[]A = {1,2,3,2,2};
        System.out.println(distinct.solution(A));
    }

    public int solution(int[] A){
        int length = A.length;
        if (length == 0){
            return 0;
        }
        Arrays.sort(A);
        int previous = A[0];
        int result = 1;
        for (int i = 1; i<length; i++){
            if (A[i] != previous){
               result++;
               previous = A[i];
            }
        }
        return result;
    }
}
