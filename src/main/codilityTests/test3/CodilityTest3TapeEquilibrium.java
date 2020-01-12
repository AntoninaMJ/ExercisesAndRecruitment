package main.codilityTests.test3;

public class CodilityTest3TapeEquilibrium {

    public static void main(String[] args) {
        int[] A = {0, 10, 15, 30};
        System.out.println(new Solution().solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            int minDifference = -1;
            int actualDifference = 0;
            int firstSum = 0;
            int secondSum = 0;
            int length = A.length;

            for (int element : A) {
                secondSum = secondSum + element;
            }

            for (int i = 0; i < A.length - 1; i++) {
                int element = A[i];
                firstSum = firstSum + element;
                secondSum = secondSum - element;
                actualDifference = Math.abs(secondSum - firstSum);
                if (minDifference == -1 || actualDifference < minDifference) {
                    minDifference = actualDifference;
                }
            }

            return minDifference;
        }
    }
}
