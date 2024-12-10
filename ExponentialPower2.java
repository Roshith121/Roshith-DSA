package org.example;

public class ExponentialPower2 {

    public static void main(String[] args) {
        int n=2;
        int p=8;
        System.out.println("Power : "+power(n,p));

    }

    private static int power(int num, int power){

        if(power==0){
            return 1;
        }
        int pow = power(num,power/2);
        if(power%2!=0){
            return num*pow*pow;
        }
        else{
            return pow*pow;
        }
    }
}
