package com.adidas;

public class ParenthesisClosed {
    public static void main(String[] args) {
//        String str = "()[{}()]";
        String str = "( )[ ) } ( { ]";
       boolean result =  checkParenthesisClosed(str);
       System.out.println("result======>"+result);
    }

    private static boolean checkParenthesisClosed(String str) {
        int round = 0;
        int square = 0;
        int curly = 0;
        for (char bracket : str.toCharArray()){
            switch (bracket){
                case '(':
                    round++;
                    break;
                case ')':
                    round--;
                    break;
                case '[':
                    square++;
                    break;
                case ']':
                    square--;
                    break;
                case '{':
                    curly++;
                    break;
                case '}':
                    curly--;
                    break;
            }
        }
        if(round==0 && curly==0 && square==0){
            return true;
        }
        return false;
    }
}
