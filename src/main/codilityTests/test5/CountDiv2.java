package main.codilityTests.test5;

public class CountDiv2 {
    public static void main(String[] args) {
        int A = 6;
        int B = 11;
        int K = 2;

        System.out.println(new Solution().solution(A, B, K));

    }

    static class Solution {
        public int solution(int A, int B, int K)  {
            int result = 0;
            for (int i = A; i<=B; i++){
                int modulo = i%K;
                if (modulo==0){
                    result ++;
                }
            }
            return result;
        }
    }
}
