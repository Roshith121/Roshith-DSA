package org.example;

import java.util.Stack;

public class MakeBalancedParanthasis {
    public static void main(String[] args) {
        
        String str ="(()))";
        System.out.println(deleteParanthasisToMakeItBalanced(str));
    }

    private static int deleteParanthasisToMakeItBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for(Character ch : str.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            } else if (ch==')') {
                if (stack.size()==0)
                    stack.push(')');
                else
                    stack.pop();
            }
        }
        return stack.size();
    }
}
