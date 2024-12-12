package org.example;

import java.util.Arrays;
import java.util.List;

public class SubsetString {

    public static void main(String[] args) {

        String st ="abc";
        String op = "";
        getPowerset(st,0,op);

    }

    private static void getPowerset(String st, int i, String op) {
        if(i==st.length()){
            System.out.println(op);
            return;
        }
        getPowerset(st,i+1,op+st.charAt(i));
        getPowerset(st,i+1,op);
    }

}
