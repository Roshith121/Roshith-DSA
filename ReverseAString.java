package org.example;

public class ReverseAString {

    public static void main(String[] args) {
    char[] s = {'h','e','l','l','o'};
        System.out.println(s);
        System.out.println(reverseString(s));
    }

    public static char[] reverseString(char[] s) {
        String reverseS="";
        for(int i=s.length-1;i>=0;i--){
            reverseS+=s[i];
        }
        return reverseS.toCharArray();
    }
}
