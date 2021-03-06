package main.codilityTests.test9;

public class MaxSliceSum {
    //A = {3, 2, -6, 4, 0};
    //return = 5;

    // A = {-3, -2, -6, -4};
    //return -2;
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {-3, -2, -6, -4};
        System.out.println(solution.solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            int maxTemp;
            int maxSum = A[0];
            for (int i = 0; i < A.length; i++) {
                maxTemp = A[i];
                maxSum = Math.max(maxSum, maxTemp);
                for (int j = i + 1; j < A.length; j++){
                    maxTemp += A[j];
                    maxSum = Math.max(maxSum, maxTemp);
                }
            }
            return maxSum;
        }
    }
}
