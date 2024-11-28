package org.example;

import java.util.Arrays;
import java.util.List;

public class KanadesAlgo {
    
    public static void main(String []args){
        
        List<Integer> intList = Arrays.asList(-2,3,4,5,423,656,-113,24,-243);
        System.out.println("Maximum sum or continues substring using Kadanes algo : "+kadanes(intList));
        
    }

    private static int kadanes(List<Integer> intList) {

        int curSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(Integer num:intList ){
            curSum+=num;
            maxSum=Math.max(maxSum,curSum);
            if(curSum<0)
                curSum=0;

        }
        return maxSum;
    }

}
