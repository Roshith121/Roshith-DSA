package org.example;

public class ReverseString {

    public static void main(String[] args) {

        String str = "I LOVE MY INDIA";
        reverse(str);
    }

    private static void reverse(String str) {

        if(str.length()<=1){
            System.out.print(str);
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }

    }
}
