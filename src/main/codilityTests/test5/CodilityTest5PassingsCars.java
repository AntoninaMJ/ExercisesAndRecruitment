package main.codilityTests.test5;

public class CodilityTest5PassingsCars {

    public static void main(String[] args) {
        int[] A = {0,1,0,1,1};

        int result = new Solution().solution(A);
        System.out.println(result);

    }

    static class Solution {
        public int solution(int[] A)  {
            int pairs = 0;
            int sumStart = 0;
            int sumFinish = 0;

            for (int element:A) {
                sumFinish += element;
            }

            for (int i = 0; i<A.length; i++){
                if (A[i]==0){
                    pairs = pairs + sumFinish;
                    if (pairs>1000000000){
                        return -1;
                    }
                } else {
                    sumFinish = sumFinish-1;
                }
            }
            return pairs;
        }
    }
}
