package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicRotation {

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(22,33,4,212,5,56,23,65);
        System.out.println(cyclicRotationByOne(ls));
    }

    private static List<Integer> cyclicRotationByOne(List<Integer> ls) {

        List<Integer> cyclicList = new ArrayList<>();
        cyclicList.add(ls.get(ls.size()-1));
        for(int i=0;i<ls.size()-1;i++){
            cyclicList.add(ls.get(i));
        }
        return cyclicList;
    }
}
