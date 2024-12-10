package org.example;

public class Fibonacci {

    public static void main(String[] args) {
        int n =9;
        for(int i=0;i<n;i++){
            System.out.println(" "+fib(i));
        }
    }
    private static int fib(int n){

        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
