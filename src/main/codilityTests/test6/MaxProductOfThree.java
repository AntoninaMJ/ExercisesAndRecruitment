package main.codilityTests.test6;

public class MaxProductOfThree {

    public static void main(String[] args) {
        //int[] table = {-3,1,2,-2,5,6};
        int[] table = {4, 5, 1, 0};
        int result;
        MaxProductOfThree soultion = new MaxProductOfThree();
        System.out.println(soultion.solution(table));
    }

    public int solution(int [] A){
        int length = A.length;
        int max;
        int result = A[0]*A[1]*A[2];
        for (int i = 0; i<length-2; i++){
            for (int j = i+1; j<length-1; j++){
                for (int k = j+1; k<length; k++){
                    max = A[i]*A[j]*A[k];
                    if (max>result){
                        result = max;
                    }
                }
            }
        }
        return result;
    }
}
