package recruintmentTests;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{4, 5, 6, 2}));

    }

    static class Solution {
        private int solution(int[] A) {
            int result = -1;
            return result;
        }
    }
}



//    SELECT r.name from (
//        SELECT t1.turn, t1.name, t1.weight, sum(t2.weight)
//        FROM line t1 inner join line t2 on t1.turn >= t2.turn
//        GROUP BY t1.turn, t1.name, t1.weight
//        HAVING sum(t2.weight) <= 1000
//        ORDER BY t1.turn)
//        as r
//        ORDER BY r.rn desc LIMIT 1