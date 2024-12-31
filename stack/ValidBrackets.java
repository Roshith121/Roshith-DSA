package org.example;

import java.util.Stack;

public class ValidBrackets {
    public static void main(String[] args) {
        String brackets ="]";
        System.out.println(validate(brackets));
    }

    private static boolean validate(String brackets) {
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for(char ch: brackets.toCharArray()) {
            if (ch == '(' )
                stack.push(')');
            else if (ch=='{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else{
                if(!stack.isEmpty() && ch==stack.peek()){
                    flag= true;
                    stack.pop();
                }
                else
                    return false;

            }
        }
        if(stack.size()==0)
            flag =true;
        else flag=false;
        return flag;
    }
}
