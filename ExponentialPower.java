package org.example;

public class ExponentialPower {

    public static void main(String[] args) {
        int n=2;
        int p=8;
        System.out.println("Power : "+power(n,p));

    }

    private static int power(int num, int power){

        if(power==0){
            return 1;
        }
        return num* power(num,power-1);
    }
}
