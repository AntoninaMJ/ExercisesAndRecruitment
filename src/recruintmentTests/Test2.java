package recruintmentTests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {
        Solution solution = new Solution();
       // System.out.println(solution.solution(new int[]{4, 5, 6, 2}));

    }

    static class Solution {

        public int solution(Tree T) {
            return subTree(T, new HashSet<>());
        }

        private int subTree(Tree T, Set<Integer> value) {
            value.add(T.x);

            if (T.l == null && T.r == null) {
                return value.size();
            }

            int l = 0;
            int r = 0;

            if (T.r != null) {
                l = subTree(T.r, new HashSet<>(value));
            }
            if (T.l != null) {
                r = subTree(T.l, new HashSet<>(value));
            }

            return Math.max(l, r);
        }


    }

    static class Tree {
        int x;
        Tree l;
        Tree r;
    }
}


