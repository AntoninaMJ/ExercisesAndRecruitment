package main.recruitmentTests;

public class Test1 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[][]{new int[]{0, 1, 9, 3}, new int[]{7, 5, 8, 3}, new int[]{9, 2, 9, 4}, new int[]{4, 6, 7, 1}}));

    }

    static class Solution {
        private int solution(int[][] A) {
            int result = 0;
            int lengthRow = A.length;
            int lengthColumn = A[0].length;

            for (int i = 1; i < lengthRow - 1; i++) {
                for (int j = 1; j < lengthColumn - 1; j++) {
                    if (A[i][j] < A[i][j-1] && A[i][j] < A[i][j+1]){
                        if (A[i][j] > A[i-1][j] && A[i][j] > A[i+1][j]){
                            result++;
                        }
                    }
                    if (A[i][j] > A[i][j-1] && A[i][j] > A[i][j+1]){
                        if (A[i][j] < A[i-1][j] && A[i][j] < A[i+1][j]){
                            result++;
                        }
                    }
                }
            }


            return result;

        }
    }
}
