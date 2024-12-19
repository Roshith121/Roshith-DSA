package org.example;

public class RemoveAllNonAlpha {

    public static void main(String[] args) {
        String str ="sjdjash%^%asjdb";
        char[] ch = str.toCharArray();
        String newStr="";
        System.out.println(remAllNonAlpha(ch,newStr));
    }

    private static String remAllNonAlpha(char[] ch, String newStr) {
        for(char newch: ch){
            if(Character.isAlphabetic(newch))
                newStr+=newch;
        }
        return newStr;
    }
}

