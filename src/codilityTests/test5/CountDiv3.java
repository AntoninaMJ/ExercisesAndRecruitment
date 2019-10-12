package codilityTests.test5;

public class CountDiv3 {
    public static void main(String[] args) {
        int A = 11;
        int B = 345;
        int K = 17;

        System.out.println(new Solution().solution(A, B, K));

    }

    static class Solution {
        public int solution(int A, int B, int K)  {
            int result = (B-A)/K;
            if (A%K == 0 || B%K == 0){
                result ++;
            }

            return result;
        }
    }
}
/*
A = 11, B = 345, K = 17
got 19, exp 20
 */