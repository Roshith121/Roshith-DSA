package org.example;

import java.util.Arrays;
import java.util.List;

public class NumberToWord {


    public static void main(String[] args) {
        int number = 980234;
        List<String> numInWords = Arrays.asList("zero","one","two","three","four","five","six","seven","eight","nine");
        numberToWord(number,numInWords);
    }

    public static void numberToWord(int n ,List<String> wordList){
        if(n==0){
            return;
        }
        numberToWord(n/10,wordList);
        int i = n%10;
        System.out.print(wordList.get(i)+" ");


    }
}
