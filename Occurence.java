package org.example;

public class Occurence {


    public static void main(String[] args) {

        String str = "I LOVE MY INDIIA";
        int count =0;
        char ch ='I';
        int freq = countOccc(str,count,0,ch);
        System.out.println(freq);
    }

    private static int countOccc(String str, int count,int i,char ch) {
        if(str.length()==i){
            return count;
        }
        if(str.charAt(i)==ch){
            count++;
        }
        return countOccc(str,count,++i,ch);
    }
}
