package org.example;

public class ExpandCompressedString {

    public static void main(String[] args) {

        String str = "a2b4c2";
        String resultStr="";
        String expandedString = expandString(str,resultStr);
        System.out.println(expandedString);
    }

    private static String expandString(String str, String resultStr) {

        for(int i =0;i<str.length();i++){
            if(Character.isDigit(str.charAt(0))){
                System.out.println("invalid input");
                return resultStr;
            }
            if(Character.isDigit(str.charAt(i))){
                int number = str.charAt(i)-'0';
                char temp = str.charAt(i-1);
                for(int j =0;j<number-1;j++){
                    resultStr+=temp;
                }
            }
            else{
                resultStr = resultStr+str.charAt(i);
            }
        }
        return resultStr;
    }
}
