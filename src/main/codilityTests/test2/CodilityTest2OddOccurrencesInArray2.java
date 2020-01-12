package main.codilityTests.test2;

import java.util.Arrays;

public class CodilityTest2OddOccurrencesInArray2 {

    public static void main(String[] args) {

        int[] A = {9, 3, 9, 3, 10, 5, 5};
        System.out.println(new Solution().solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            for (int i = 0; i < A.length - 1; i= i+2)
                if (!(A[i] == A[i + 1])) {
                    return A[i];
                }
            return A[A.length-1];
        }
    }
}
