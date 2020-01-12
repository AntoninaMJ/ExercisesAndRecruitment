package main.codilityTests.test7;

import java.util.Stack;

public class Nesting {
    public static void main(String[] args) {

        String s1 = "(()(())())";
        String s2 = "())";
        System.out.println(new Nesting().solution(s1));
        System.out.println(new Nesting().solution(s2));

        System.out.println(new Nesting().solutionInternet(s1));
        System.out.println(new Nesting().solutionInternet(s2));

        System.out.println(new Nesting().solutionMyStack(s1));
        System.out.println(new Nesting().solutionMyStack(s2));
    }

    public int solutionMyStack(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) == '('){
                stack.push('(');
            } else {
                if (stack.isEmpty()){
                    return 0;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty()? 1 : 0;
    }
    public int solutionInternet(String S) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case '(':
                    stack.push(S.charAt(i));
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') return 0;
                    else stack.pop();
                    break;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    //działa: moje pierwsze rozwiązanie
    public int solution(String S) {
        int[] table = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                table[i] = 1;
            } else {
                table[i] = -1;
            }
        }

        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum = sum + table[i];
            if (sum < 0) {
                return 0;
            }
        }
        if (sum > 0) {
            return 0;
        }
        return 1;
    }


}
