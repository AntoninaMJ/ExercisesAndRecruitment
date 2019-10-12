package codilityTests.test3;

public class CodilityTest3FrogJmp {

    public static void main(String[] args) {


        System.out.println(new Solution().solution(1,6,2));
    }

    static class Solution {
        public int solution(int X, int Y, int D) {
            int result;
            int modulo = (Y-X)%D;
            int floor = (int)Math.floor((Y-X)/D);
            if (modulo==0){
                result = floor;
            } else {
                result = floor +1;
            }

            return result;
        }
    }
}

