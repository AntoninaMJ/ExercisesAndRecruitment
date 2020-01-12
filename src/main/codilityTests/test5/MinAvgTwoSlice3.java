package main.codilityTests.test5;

public class MinAvgTwoSlice3 {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        //result = 1

        System.out.println(new MinAvgTwoSlice3.Solution().solution(A));

    }

    static class Solution {
        public int solution(int[] A) {
            final int N = A.length;
            int minIndex = 0;
            double minAvg = ((double) (A[0] + A[1])) / 2;
            double minTemp = Double.MAX_VALUE;

            //2 slice
            for (int i = 2; i < N; i++) {
                minTemp = ((double) (A[i] + A[i - 1])) / 2;
                if (minTemp < minAvg) {
                    minAvg = minTemp;
                    minIndex = i - 1;
                }

                //3 slice
                minTemp = ((double) (A[i] + A[i - 1] + A[i - 2])) / 3;
                if (minTemp < minAvg) {
                    minAvg = minTemp;
                    minIndex = i - 2;
                }
            }
            return minIndex;
        }
    }
}
