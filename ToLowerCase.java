package org.example;

public class ToLowerCase {

    public static void main(String[] args) {

        String str = "HeLLo IndiA";
        char[] ch = str.toCharArray();
        String newSt="";
        toLower(ch,0,newSt);

    }

    private static void toLower(char[] ch, int i, String newSt) {
        if(i==ch.length){
            System.out.println(newSt);
            return;
        }
        newSt+=Character.toLowerCase(ch[i]);
        toLower(ch,i+1,newSt);
    }
}
