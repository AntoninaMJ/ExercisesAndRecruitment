package main.codilityTests.test7;

public class Brackets {
    public static void main(String[] args) {

        Brackets brackets = new Brackets();
        String s = "{[()()]}";
        //String s = "([)()]";
        System.out.println(brackets.solution(s));
    }

    public int solution(String S) {

        char[] table = S.toCharArray();
        int length = table.length;
        if (length == 0){
            return 1;
        }
        int firstOpen = 0;
        int secondOpen = 0;
        int thirdOpen = 0;
        char previous = table[0];

        for (char character : table) {
            if ((previous=='{' && character==']') ||
                    (previous=='{' && character==')') ||
                    (previous=='[' && character=='}') ||
                    (previous=='[' && character==')') ||
                    (previous=='(' && character==']') ||
                    (previous=='(' && character=='}')){
                return 0;
            }
            switch (character) {
                case '{':
                    firstOpen++;
                    break;
                case '}':
                    firstOpen--;
                    break;
                case '[':
                    secondOpen++;
                    break;
                case ']':
                    secondOpen--;
                    break;
                case '(':
                    thirdOpen++;
                    break;
                case ')':
                    thirdOpen--;
                    break;
            }
            if (firstOpen < 0 || secondOpen < 0 || thirdOpen < 0) {
                return 0;
            }
            previous = character;
        }

        if (firstOpen == 0 && secondOpen == 0 && thirdOpen == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
