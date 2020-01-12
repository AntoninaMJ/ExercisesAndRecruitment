package main.codilityTests.test4;

public class CodilityTest4FrogRiverOne {

        public static void main(String[] args) {
            int[] A = {1,3,1,4,2,3,5,4};
            int X = 5;
            System.out.println(new Solution().solution(X, A));
        }

        static class Solution {
            public int solution(int X, int[] A) {
                int[]B = new int[X+1];
                int sum = 0;
                B[0]=0;
                for (int i = 0; i<A.length; i++){
                    if (A[i]<=X && B[A[i]]==0){
                        B[A[i]] = 1;
                        sum = sum+1;
                        if (sum == X){
                            return i;
                        }
                    }
                }
                return -1;
            }
        }
}
