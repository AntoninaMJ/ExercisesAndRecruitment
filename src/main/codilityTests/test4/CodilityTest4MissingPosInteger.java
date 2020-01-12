package main.codilityTests.test4;

import java.util.Arrays;

public class CodilityTest4MissingPosInteger {

    public static void main(String[] args) {
        int[] A = {-1, 0, 1,2};

        int result = new Solution().solution(A);
        System.out.println(result);

    }

    static class Solution {
        public int solution(int[] A)  {
            int max = 0;
            Arrays.sort(A);
            for (int i=0; i<A.length; i++){
                if(A[i]>0){
                    if (A[i] > (max+1)){
                        return max+1;
                    } else {
                        max = A[i];
                    }
                }
            }
            if (max>1){
                max = A[A.length -1];
            }
            return max +1;
        }
    }
}
