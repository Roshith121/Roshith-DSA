package org.example;

public class StackCommon {

    int max;
    int []stackArray;
    int top;

    public StackCommon(int s) {

        max=s;
        stackArray = new int[max];
        top =-1;
    }
    void push(int j ){
        stackArray[++top] = j;
    }
    int pop(){
        return stackArray[top--];
    }
    int peek(){
        return stackArray[top];
    }
    boolean isempty(){
        boolean flag =false;
        if(top==-1)
            flag= true;
        return flag;
    }
}
