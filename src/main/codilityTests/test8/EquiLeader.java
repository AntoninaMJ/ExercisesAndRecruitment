package main.codilityTests.test8;

import java.util.Arrays;

public class EquiLeader {

    public static void main(String[] args) {
        //A{4,3,4,4,4,2}
        //leader is 4
        //the function might return 2 - there are 2 slice of table which contain the leader

        //{2,3,4,4,4,4}

        Solution solution = new Solution();
        int[] A = {4,3,4,4,4,2};
        System.out.println(solution.solution(A));
    }

    static class Solution {
        public int solution(int[] A) {

            int leader = A[0];
            int counter = 1;

            for (int i = 1; i < A.length; i++) {
                if (counter == 0) {
                    counter = 1;
                    leader = A[i];
                } else if (leader == A[i]) {
                    counter++;
                } else {
                    counter--;
                }
            }

            int total = 0;
            for (int value : A) {
                if (value == leader) {
                    total++;
                }
            }
            if (total <= A.length / 2) {
                return 0;
            }
            //
            int equiLeaders = 0;
            int leaderCounterLeft = 0;
            int leaderCounterRight = total;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == leader) {
                    leaderCounterLeft++;
                    leaderCounterRight--;
                }
                if (leaderCounterLeft > (i + 1) / 2 && leaderCounterRight > (A.length - i - 1) / 2){
                    equiLeaders++;
                }
            }
            return equiLeaders;
        }
    }
}
