package codilityTests.test2;

public class CodilityTest2CyclicRotation {

    public static void main(String[] args) {

        int[] A = {1,2,3,4};
        int dlugosc = A.length;
        int K = 5;
        int[] result = new Solution().solution(A,K);
        for (int i=0; i<dlugosc; i++){
            System.out.println(result[i]);
        }
    }

    //[3, 8, 9, 7, 6], 3

    static class Solution {
        public int[] solution(int[] A, int K) {
            if (A==null){
                return A;
            }
            int dlugosc = A.length;
            if (K>dlugosc){
                K = K%dlugosc;
            }
            int [] B = new int[dlugosc];
            for (int i=0; i < K; i++){
                B[i] = A[dlugosc-K+i];
            }

            for (int i = K; i<dlugosc; i++){
                B[i] = A[i-K];
            }
            return B;
        }
    }
}
