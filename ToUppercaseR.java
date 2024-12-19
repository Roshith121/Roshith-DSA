package org.example;

public class ToUppercaseR {

    public static void main(String[] args) {
        String str = "hello india";
        char[] ch = str.toCharArray();
        String newSt="";
        toUpper(ch,0,newSt);
    }

    private static void toUpper(char[] ch, int i,String newSt) {
        if(i==ch.length) {
            System.out.println(newSt);
            return;
        }
        newSt+=Character.toUpperCase(ch[i]);
        toUpper(ch,i+1,newSt);
    }
}
