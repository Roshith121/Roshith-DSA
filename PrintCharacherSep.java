package org.example;

public class PrintCharacherSep {

    public static void main(String[] args) {

        String str ="Hello India";
        char[] ch = str.toCharArray();
        printChar(ch,0);
    }

    private static void printChar( char[] ch, int i) {
        if(i==ch.length)
            return ;
        System.out.println(ch[i]);
        printChar(ch,i+1);
    }
}
