package main.codilityTests.test4;

public class CodilityTest4MaxCounters {

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;

        int[] B = new Solution().solution(N, A);
        for (int element : B) {
            System.out.println(element);
        }

    }

    static class Solution {
        public int[] solution(int N, int[] A) {
            int[] result = new int[N];
            int maximum = 0;
            boolean maxSetted = false;

            for (int i = 0; i < A.length; i++) {
                if (A[i] > N) {
                    if (!maxSetted) {
                        for (int j = 0; j < result.length; j++) {
                            result[j] = maximum;
                        }
                    }
                    maxSetted = true;
                } else {
                    maxSetted = false;
                    result[A[i] - 1]++;
                    if (maximum < result[A[i] - 1]) {
                        maximum = result[A[i] - 1];
                    }
                }
            }

            return result;
        }
    }
}

//[3, 2, 2, 4, 2]
//(0, 0, 1, 0, 0)
//      (0, 0, 1, 1, 0)
//    (0, 0, 1, 2, 0)
//  (2, 2, 2, 2, 2)
//(3, 2, 2, 2, 2)
//(3, 2, 2, 3, 2)
//(3, 2, 2, 4, 2)