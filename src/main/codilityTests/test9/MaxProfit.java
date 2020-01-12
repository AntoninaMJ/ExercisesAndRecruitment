package main.codilityTests.test9;

public class MaxProfit {
    public static void main(String[] args) {
        //A = {23171, 21011, 21123, 21366, 21013, 21367}
        //result = 356;

        Solution solution = new Solution();
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution.solution(A));

    }

    static class Solution {
        public int solution(int[] A) {
            final int N = A.length;
            if (N < 2) {
                return 0;
            }
            int profit = 0;
            int buy = A[0];
            int value;
            for (int i = 1; i < N; i++) {
                value = A[i];
                profit = Math.max(profit, value - buy);
                buy = Math.min(value, buy);
            }
            return profit;
        }
    }
}


/*
1 def golden_max_slice(A):
2   max_ending = max_slice = 0
3   for a in A:
4       max_ending = max(0, max_ending + a)
5       max_slice = max(max_slice, max_ending)
6   return max_slice
 */