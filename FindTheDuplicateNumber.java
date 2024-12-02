package org.example;

import java.util.*;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,5,3,4,5);
        System.out.println("Duplicate element : "+duplicate(nums));
    }

    private static int duplicate(List<Integer> nums){
        Set<Integer> duplicateNums = new HashSet<>();
        for(int i :nums){
            if(duplicateNums.contains(i)){
                return i;
            }
            else{
                duplicateNums.add(i);
            }
        }
        return 0;
    }
}
