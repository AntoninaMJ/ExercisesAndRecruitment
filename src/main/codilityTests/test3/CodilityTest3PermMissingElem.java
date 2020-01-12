package main.codilityTests.test3;

import java.util.Arrays;

public class CodilityTest3PermMissingElem {

    public static void main(String[] args) {
        int[] A = {1, 6, 3, 4, 5, 8, 2};
        System.out.println(new Solution().solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);

            for (int i = 0; i < A.length; i++) {
                if ((A[i] - A[i - 1]) > 1) {
                    return A[i] - 1;
                }
            }

            if (A.length > 0) {
                if (A[0] > 1) {
                    return A[0] - 1;
                } else {
                    return A[A.length - 1] + 1;
                }
            } else {
                return 1;
            }
        }
    }

}
