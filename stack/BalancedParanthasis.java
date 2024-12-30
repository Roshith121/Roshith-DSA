package org.example;


import java.util.Stack;

public class BalancedParanthasis
{
    public static void main(String[] args) {

        String paranthasis = "((((()))))";
        System.out.println(isParanthasisBalanced(paranthasis));
    }

    private static boolean isParanthasisBalanced(String paranthasis) {
        Stack<Character> stack = new Stack<>();
        for(Character ch :paranthasis.toCharArray() ){
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                if(stack.size() ==0)
                    return false;
                else if(stack.size()!=0)
                {
                    stack.pop();
                }
            }
        }
        if(stack.size()==0)
            return true;
        else
            return false;
    }
}
