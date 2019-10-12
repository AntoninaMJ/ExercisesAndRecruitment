package codilityTests.test2;

public class CodilityTest2OddOccurrencesInArray {
    public static void main(String[] args) {

        int[] A = {9, 3, 9, 3, 9, 5, 8, 5};
        System.out.println(new Solution().solution(A));
    }
    static class Solution {
        public int solution(int[] A) {
            int lengthA = A.length;
            int reszta = lengthA%4;

            for (int i = 0; i<(lengthA-reszta); i=+4){
                if (!(A[i]==A[i+2])){
                    return A[i];
                } else if (!(A[i+1]==A[i+3])){
                    return A[i+1];
                }
            }

            if (reszta == 1){
                return A[lengthA-1];
            } else if (reszta == 2){
                if (!(A[lengthA-3]==A[lengthA-1])){
                    return A[lengthA-3];
                } else {
                    return -1;
                }
            } else if (reszta == 3){
                return A[lengthA-2];
            }
            return -1;
        }
    }

}
