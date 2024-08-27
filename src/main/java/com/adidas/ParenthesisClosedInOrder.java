package com.adidas;

public class ParenthesisClosedInOrder {
    public static void main(String[] args) {
        String str = "()[{}()]";
//        String str = "(){([])}";
        boolean isStringValid = isValid2(str);
        System.out.println("isStringValid======>" + isStringValid);
//       boolean result =  checkParenthesisClosed(str);
//       System.out.println("result======>"+result);
    }

    private static boolean isValid2(String str) {
        char[] stack = new char[str.length()];
        int i = -1;
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else {
                if (i >= 0
                        && ((stack[i] == '(' && ch != ')')
                        || (stack[i] == '[' && ch != ']')
                        || (stack[i] == '{' && ch != '}')
                )) {
                    return false;
                } else {
                    --i;
                }
            }
        }

        return i == -1;
    }

    private static boolean checkParenthesisClosed(String str) {
        int round = 0;
        int square = 0;
        int curly = 0;
        for (char bracket : str.toCharArray()) {
            switch (bracket) {
                case '(':
                    round++;
                    break;
                case ')':
                    round--;
                    if (round < 0) return false;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    if (square < 0) return false;
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    if (curly < 0) return false;
                    break;
            }
        }
        if (round == 0 && curly == 0 && square == 0) {
            return true;
        }
        return false;
    }


    private static boolean checkParenthesisClosed_correct(String str) {
        int round = 0;
        int square = 0;
        int curly = 0;

        int lastOperand = 0;
        for (char bracket : str.toCharArray()) {
            switch (bracket) {
                case '(':
                    round++;
                    break;
                case ')':
                    if (round == 0 && lastOperand != '(') return false;
                    round--;
                    if (round < 0 && lastOperand != '(') return false;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    if (square < 0) return false;
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    if (curly < 0) return false;
                    break;
            }
        }
        if (round == 0 && curly == 0 && square == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValid(String s) {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack[++i] = ch;
            else {
                if (i >= 0
                        && ((stack[i] == '(' && ch == ')')
                        || (stack[i] == '{' && ch == '}')
                        || (stack[i] == '[' && ch == ']')))
                    i--;
                else
                    return false;
            }
        }
        return i == -1;
    }

}
