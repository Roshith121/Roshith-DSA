package org.example;

public class NumberOfJumps {

    public static void main(String[] args) {
        System.out.println(jumps(9));

    }

    private static int jumps(int numOfStairs) {
        if(numOfStairs<0){
            return 0;
        }
        if(numOfStairs==0){
            return 1;
        }
        return jumps(numOfStairs-1) + jumps(numOfStairs-2)+jumps(numOfStairs-3);
    }
}
