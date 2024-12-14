package org.example;

public class RemSpace {
    static String str = "";
    public static void main(String[] args) {
        String inputStr ="I LOVE MY ROSHITH AND INDIA";
        System.out.println(removeSpace(inputStr));
    }
    private static String removeSpace(String inputStr) {

        if(inputStr.length()==0){
            return "";
        }
        if(inputStr.charAt(0)==' '){
            return removeSpace(inputStr.substring(1));
        }
       return inputStr.charAt(0) + removeSpace(inputStr.substring(1));
    }
}