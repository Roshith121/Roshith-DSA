package org.example;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Anagram {
    public static void main(String[] args) {

        String str = "river";
        String str2 = "virre";

        char[] ch = str.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
       if(Arrays.equals(ch,ch2)){
           System.out.println("Given string are anagram");
       }
       else{
           System.out.println("Not an anagram");
       }
    }
}
