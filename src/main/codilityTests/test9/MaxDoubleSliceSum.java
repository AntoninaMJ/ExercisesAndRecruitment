package main.codilityTests.test9;

public class MaxDoubleSliceSum {
    //A = {3, 2, 6, -1, 4, 5, -1, 2};
    //result = 17 = 2+6+4+5


    public static void main(String[] args) {
        int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
        Solution solution = new Solution();
        System.out.println(solution.solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            int result = A[0] + A[2];
            return result;
        }
    }
}
