package main.recruitmentTests;

import java.util.Arrays;

public class SmallestNumberDoesnt {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, -2, -5}));

    }

    static class Solution {
        private int solution(int[] A) {
            Arrays.sort(A);
            int length = A.length;
            if (A[0] > 1) {
                return 1;
            }

            for (int i = 0; i < length - 1; i++) {
                if (A[i + 1] > 1) {
                    if (A[i] < (A[i + 1] - 1)) {
                        if (A[i] < 0) {
                            return A[i] + 1;
                        } else {
                            return 1;
                        }
                    }
                }
            }
            return 1;
        }
    }
}
