package org.example;

import java.util.ArrayList;
import java.util.List;

public class AnagramRecursion {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";

        List<String> allPerm = new ArrayList<>();
        List<String> permList = allPermutations(str1,0,allPerm);

        if(permList.contains(str2))
            System.out.println("given string in a anagram");
        else
            System.out.println("Not a anagram");
    }

    private static List<String> allPermutations(String str, int index, List<String> allPerm) {


        if(str.length()==index){
            allPerm.add(str);
            return allPerm;
        }
        StringBuilder strBuilder = new StringBuilder(str);
        for(int i =0;i< str.length();i++){

            swap(strBuilder,index,i);
            allPermutations(strBuilder.toString(),index+1,allPerm);
            swap(strBuilder,index,i);
        }
        return allPerm;
    }

    private static void swap(StringBuilder st, int index, int i) {
        char temp = st.charAt(i);
        st.setCharAt(i,st.charAt(index));
        st.setCharAt(index,temp);
    }

}
