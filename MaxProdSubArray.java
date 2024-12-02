package org.example;

import java.util.Arrays;
import java.util.List;

public class MaxProdSubArray {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(-8,-4,4,-3);
        int maxProd = maxProd(nums);
        System.out.println(-4*-8);
        System.out.println(maxProd);

    }

    private static Integer  maxProd(List<Integer> nums){

        Integer maxProd = Integer.MIN_VALUE;
        Integer curProd = 1;

        for(int i : nums){
            curProd*=i;
            maxProd = Math.max(curProd,maxProd);
        }
        return maxProd;
    }


}
