package org.example;

import java.util.Arrays;

public class Pallindrome {

    public static void main(String[] args) {

        String st="racecar";
        boolean is = isPallindrone(st);
        System.out.println(is);
    }

    private static boolean isPallindrone(String st) {
        if(st.length()==0)
            return false;
        int start =0;
        int end = st.length()-1;
        while(start<=end){
            if(st.charAt(start)!= st.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


}
