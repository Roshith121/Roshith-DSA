package org.example;

import java.util.Stack;

public class RemoveConsecutiveSubsec {
    public static void main(String[] args) {
        int[] arr ={1,2,2,2,3,3,4,6,6,6};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> revstack = new Stack<>();
        for(int i=0;i<arr.length-1;i++){
            if(!stack.isEmpty() && stack.peek()==arr[i]){
                if(stack.peek() == arr[i+1])
                    continue;
                stack.pop();

            }
            else {
                stack.push(arr[i]);
            }
        }
        while(!stack.isEmpty()){
            revstack.push(stack.pop());
        }

        while(!revstack.isEmpty()){
            System.out.println(revstack.pop());
        }

    }
}
