package org.example;

import java.util.Arrays;
import java.util.List;

public class SortedUnsorted {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,5,6,7,8,9);
        if(isSorted(numList,1)){
            System.out.println("Number is sorted");
        }
        else{
            System.out.println("Number is unsorted");
        }
    }

    private static boolean isSorted(List<Integer> numList, int index){
        if(index>=numList.size()){
            return true;
        }
        if(numList.get(index)<numList.get(index-1)){
            return false;
        }
        return isSorted(numList,++index);
    }
}
