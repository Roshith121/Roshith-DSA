package org.example;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("factorial is :"+factorial(5));
    }


     private static int factorial(int n){
        if(n==1){
            return n;
        }
        return n*factorial(n-1);
    }
}
