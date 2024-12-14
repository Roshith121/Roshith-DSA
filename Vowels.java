package org.example;

public class Vowels {

    public static void main(String[] args) {
        String st = "MY NAME IS ROSHITH RAJ";
        int count =0;
        count = countVowels(st,count,0);
        System.out.println("number of vowels in string "+count);
    }

    private static int countVowels(String st, int count, int i) {

        if(i==st.length()){
            return count;
        }
            if(st.charAt(i)=='A'|| st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U'){
            count++;
            }
        return countVowels(st,count,i+1);
    }

}
