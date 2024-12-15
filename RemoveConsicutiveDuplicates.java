package org.example;

public class RemoveConsicutiveDuplicates
{

    public static void main(String[] args) {
        String str ="aabbbcc";
        String newStr = remDuplicate(str);
        System.out.println(newStr);
    }

    private static String remDuplicate(String str) {
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return remDuplicate(str.substring(1));
        }
        return str.charAt(0)+remDuplicate(str.substring(1));
    }
}
