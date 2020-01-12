package main.codilityTests.test6;

import java.util.Arrays;

public class MaxProductOfThree2 {

    public static void main(String[] args) {
        //int[] table = {-3,1,2,-2,5,6};
        //int[] table = {2,1,-1,0};
        //int[] table = {-3,-2,0,1,2};
        //int[] table = {5, 4, -5, -5};
        //int [] table = {-4, -6, 3, 4, 5};
        int[] table = {-4, -5, -6, -7, -10};

        int result;
        MaxProductOfThree2 soultion = new MaxProductOfThree2();
        System.out.println(soultion.solution(table));
    }

    public int solution(int[] A) {
        int length = A.length;
        int temp;
        Arrays.sort(A);

        for (int i = 0; i < A.length / 2; ++i) {
            temp = A[i];
            A[i] = A[A.length - i - 1];
            A[A.length - i - 1] = temp;
        }

        if (A[0] == 0) {
            return 0;
        }


        int result = A[0] * A[1] * A[2];
        int resultMinus = A[0] * A[length - 2] * A[length - 1];

        if (A[1] == 0 || A[2] == 0) {
            return resultMinus;
        }

        if (A[0] < 0) {
            return result;
        }

        if (result > resultMinus) {
            return result;
        } else {
            return resultMinus;
        }
    }
}
