package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class NegativeNumberToLeft {


    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(-2,3,4,2,21,-7,-9,-6);
        negativeNumberToLeftWithSorting(ls);
        System.out.println(ls);
        List<Integer> list = Arrays.asList(-2,3,4,2,21,-7,-9,-6);
        List <Integer> negativeNumberToLeftList = negativeNumberToLeft(list) ;
        System.out.println(negativeNumberToLeftList);
    }
    // with sorting
    private static void negativeNumberToLeftWithSorting(List<Integer> ls) {
        Collections.sort(ls);
    }

    private static List<Integer> negativeNumberToLeft(List<Integer> ls) {

        int j=0;
        int temp;
        for(int i=0;i<ls.size();i++){
            if(ls.get(i) < 0) {
                if (i!=j) {

                    temp =ls.get(i);
                    ls.set(i,ls.get(j));
                    ls.set(j,temp);
                }
                j++;
            }
        }
        return ls;
    }
}
