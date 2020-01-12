package main.codilityTests.test8;

public class Dominator {
    public static void main(String[] args) {
        //A{3,4,3,2,3,-1,3,3}
        //  the function may return 0, 2, 4, 6 or 7

        Solution solution = new Solution();
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(solution.solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            int dominatorIndex = -1;
            int candidate = -1;
            int size = 0;

            for (int i = 0; i < A.length; i++) {
                if (size == 0) {
                    size++;
                    candidate = A[i];
                    dominatorIndex = i;
                } else if (candidate == A[i]) {
                    size++;
                } else {
                    size--;
                }
            }

            int count = 0;
            for (int value: A) {
                if (value == candidate){
                    count++;
                }
            }
            if (count > A.length/2){
                return dominatorIndex;
            }
            return -1;
        }
    }

}
