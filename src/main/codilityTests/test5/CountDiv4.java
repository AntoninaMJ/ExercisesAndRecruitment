package main.codilityTests.test5;

public class CountDiv4 {
    public static void main(String[] args) {
        int A = 2;
        int B = 4;
        int K = 3;

        System.out.println(new Solution().solution(A, B, K));

    }

    static class Solution {
        public int solution(int A, int B, int K)  {
            int result = (B-A)/K;


            return result;
        }
    }
}
/*
A = 11, B = 345, K = 17
got 19, exp 20

Example test:    [6, 11, 2]
WRONG ANSWER  (got 2 expected 3)

int A = 0;int B = 1;int K = 2
got 1, exp 0

int A = 0;int B = 1;int K = 1;
got 2, exp 1;

minimal
A = B in {0,1}, K = 11 ✘WRONG ANSWER
got 0 expected 1

extreme_ifempty
A = 10, B = 10, K in {5,7,20} ✘WRONG ANSWER
got -1 expected 0

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.

 */