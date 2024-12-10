package org.example;

public class SumOfContinous {
    public static void main(String[] args) {

        System.out.println("Sum of n natural number is : "+ sum(5));
    }

    private static int  sum(int n){
        if(n==1){
            return n;
        }
        return n+sum(n-1);
    }
}
