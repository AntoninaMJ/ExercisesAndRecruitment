package main.codilityTests.test5;

public class CodilityTest5GenomicRangeQuery3 {
    public static void main(String[] args) {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        String S = "CAGCCTA";
        // A, C, G and T = 1, 2, 3 and 4,
        //result = [2, 4, 1]
        int[] result = new CodilityTest5GenomicRangeQuery3.Solution().solution(S, P, Q);
        for (int ele : result) {
            System.out.println(ele);
        }

    }

    static class Solution {
        public int[] solution(String S, int[] P, int[] Q) {
            int[][] representation = new int[4][S.length() + 1];
            representation[0][0] = 0;
            representation[1][0] = 0;
            representation[2][0] = 0;
            representation[3][0] = 0;

            for (int i = 0; i < S.length(); i++) {
                switch (S.charAt(i)) {
                    case 'A': {
                        representation[0][i + 1] = representation[0][i] + 1;
                        representation[1][i + 1] = representation[1][i];
                        representation[2][i + 1] = representation[2][i];
                        representation[3][i + 1] = representation[3][i];
                        break;
                    }
                    case 'C': {
                        representation[0][i + 1] = representation[0][i];
                        representation[1][i + 1] = representation[1][i] + 1;
                        representation[2][i + 1] = representation[2][i];
                        representation[3][i + 1] = representation[3][i];
                        break;
                    }
                    case 'G': {
                        representation[0][i + 1] = representation[0][i];
                        representation[1][i + 1] = representation[1][i];
                        representation[2][i + 1] = representation[2][i] + 1;
                        representation[3][i + 1] = representation[3][i];
                        break;
                    }
                    case 'T': {
                        representation[0][i + 1] = representation[0][i];
                        representation[1][i + 1] = representation[1][i];
                        representation[2][i + 1] = representation[2][i];
                        representation[3][i + 1] = representation[3][i] + 1;
                        break;
                    }
                }
            }

            int[] result = new int[P.length];
            for (int i = 0; i < P.length; i++) {
                int sumA = representation[0][Q[i] + 1] - representation[0][P[i]];
                int sumC = representation[1][Q[i] + 1] - representation[1][P[i]];
                int sumG = representation[2][Q[i] + 1] - representation[2][P[i]];
                int sumT = representation[3][Q[i] + 1] - representation[3][P[i]];

                if (sumA > 0) {
                    result[i] = 1;
                } else if (sumC > 0) {
                    result[i] = 2;
                } else if (sumG > 0) {
                    result[i] = 3;
                } else if (sumT > 0) {
                    result[i] = 4;
                }
            }
            return result;
        }
    }
}
