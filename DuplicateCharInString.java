package org.example;

import java.util.*;

public class DuplicateCharInString {
    public static void main(String[] args) {

        String st = "geeksforgeeks";
        List<Character> duplicates = getDuplicatesFromString(st);
        for(Character ch :duplicates){
            System.out.println(ch);
        }

    }

    private static List<Character> getDuplicatesFromString(String st) {
        List<Character> ch = new ArrayList<>();
        Map<Character, Integer> countOfChar = new LinkedHashMap<>();
        for(int i=0;i<st.length();i++){
            if(countOfChar.containsKey(st.charAt(i))){
                countOfChar.put(st.charAt(i),countOfChar.get(st.charAt(i))+1);
            }
            else{
                countOfChar.put(st.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer> count:countOfChar.entrySet() ){
            if(count.getValue()>1){
                ch.add(count.getKey());
            }
        }
        return ch;
    }
}
