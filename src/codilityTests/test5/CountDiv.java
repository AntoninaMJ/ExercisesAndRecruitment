package codilityTests.test5;

public class CountDiv {
    public static void main(String[] args) {
        int A = 6;
        int B = 11;
        int K = 2;

        System.out.println(new Solution().solution(A, B, K));

    }

    static class Solution {
        public int solution(int A, int B, int K)  {
            int result = 0;
            int lenght = B-A+1;
            int modulo = 0;
            int [] table = new int[lenght];

            for (int i = 0; i <lenght; i++){
                table[i] = A + i;
            }

            for (int element:table){
                modulo = element%K;
                if (modulo==0){
                    result ++;
                }
            }
            return result;
        }
    }

}
