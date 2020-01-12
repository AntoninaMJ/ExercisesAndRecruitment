package main.codilityTests.test4;

import java.util.Arrays;

public class CodilityTest4WhetherPermutation {

    public static void main(String[] args) {
        int[] A = {1};
        System.out.println(new Solution().solution(A));
    }

    static class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            if (!(A[0] == 1)){
                return 0;
            }
            for (int i=1; i<A.length; i++){
                if (!(A[i]-A[i-1]== 1)){
                    return 0;
                }
            }

            return 1;
        }
    }
}
