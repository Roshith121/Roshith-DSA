package org.example;

public class FirstOccurenece {

    public static void main(String[] args) {

        String str = "YOU LOVE MY INDIA";
        char ch = 'N';
        int firstOcc = firstOccur(str,ch,0);
        System.out.println(firstOcc);
    }

    private static int firstOccur(String str, char ch, int i) {
        if(str.length()==i)
            return -1;
        if(str.charAt(i)==ch)
            return i;
        return firstOccur(str,ch,++i);
    }
}
