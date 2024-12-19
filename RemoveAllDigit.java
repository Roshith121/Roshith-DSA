package org.example;

public class RemoveAllDigit {

    public static void main(String[] args) {

        String dgString = "12abs334e4";
        String str ="";
        char[] ch = dgString.toCharArray();
        for(char digitNaiHai : ch){
            if(!Character.isDigit(digitNaiHai)){
                str+=digitNaiHai;
            }
        }
        System.out.println(str);
    }
}
