package codilityTests.test5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodilityTest5GenomicRangeQuery {

    public static void main(String[] args) {
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        String S = "CAGCCTA";

        int[] result = new Solution().solution(S, P, Q);
        for (int ele:result) {
            System.out.println(ele);
        }

    }

    static class Solution {
        public int[] solution(String S, int[] P, int[] Q)  {

            char[] tableSentenceChars = S.toCharArray();
            int[] tableSentenceInts = new int[tableSentenceChars.length];
            int[] tableResult = new int[P.length];

            Map<String, Integer> mappings = new HashMap<>();
            mappings.put("A",1);
            mappings.put("C",2);
            mappings.put("G",3);
            mappings.put("T",4);

            //zamiana zdania na cyfry
            for (int i = 0; i<tableSentenceChars.length; i++) {
                tableSentenceInts[i] = mappings.get(Character.toString(tableSentenceChars[i]));
            }

            //przechodzi po kazdej iteracji tablicy P i Q,
            for (int i = 0; i<P.length; i++){
                int from = P[i];
                int to = Q[i];
                int fromToQty = (to-from)+1;
                //uzupełnia tablicę from do to, sortuje, odnajduje najmniejszą wartość, przekazuje tablicy result
                int[] tableFromTo = new int[fromToQty];
                for (int j = 0; j<fromToQty; j ++) {
                    tableFromTo[j] = tableSentenceInts[P[i]+j];
                }
                Arrays.sort(tableFromTo);
                tableResult[i] = tableFromTo[0];
            }
            return tableResult;
        }
    }
}


