package main.codilityTests.test4;

import java.util.HashSet;
import java.util.Set;

public class CodilityTest4FrogRiverOne2 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, new int[]{3, 4, 2,5,4, 1, 3, 3}));

    }

    static class Solution {
        private int solution(int x, int[] a) {
            int result = -1;
            int length = a.length;
            Set<Integer> b = new HashSet<>();
            for (int i = 0; i < length; i++) {
                int number = a[i];
                if (number <= x){
                    if (!b.contains(number)){
                        b.add(number);
                        if (b.size() == (x)){
                            result = i;
                            break;
                        }
                    }
                }
            }
            return result;
        }
    }
}
