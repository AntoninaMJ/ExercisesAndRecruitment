package main.codilityTests.test6;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] A = {1,2,5,6,8,10,20};
        Triangle triangle = new Triangle();
        System.out.println(triangle.solution(A));
    }

    public int solution(int[] A) {
        int length = A.length;
        if (length < 3) {
            return 0;
        }

        Arrays.sort(A);
        for (int i = 0; i < length - 2; i++) {
            if ((A[i]+A[i+1])>A[i+2]){
                if ((A[i+1]+A[i+2])>A[i]){
                    if ((A[i+2]+A[i])>A[i+1]){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
