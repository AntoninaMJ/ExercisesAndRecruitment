package main.codilityTests.test9;

public class MaxSliceSum2 {
    //A = {3, 2, -6, 4, 0};
    //return = 5;

    // A = {-3, -2, -6, -4};
    //return -2;
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {3, 2, -6, 6, 0};
        System.out.println(solution.solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            int maxTemp = A[0];
            int maxSum = A[0];
            for (int i = 1; i < A.length; i++) {
                maxTemp = Math.max(A[i], maxTemp + A[i]);
                maxSum = Math.max(maxSum, maxTemp);
            }
            return maxSum;
        }
    }
}
