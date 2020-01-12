package main.codilityTests.test5;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};

        System.out.println(new Solution().solution(A));

    }

    static class Solution {
        public int solution(int[] A) {
            int minFirst = 0;
            float minAverage = (A[0] + A[1]) / 2;
            float sum = 0;
            float qty = 0;

            //pętla od 0 elementu
            for (int i = 0; i < A.length - 1; i++) {
                sum = A[i];
                qty = 1;
                //pętla do ostatniego elementu
                for (int j = i + 1; j < A.length; j++) {
                    sum += A[j];
                    qty = j - i + 1;
                    float average = sum / qty;
                    if (average < minAverage) {
                        minFirst = i;
                        minAverage = average;
                    }
                }
            }
            return minFirst;
        }
    }
}