package org.example;

public class CountWords {

    public static void main(String[] args) {
        String str = "I LOve india";
        int ct = countWords(str);
        System.out.println(ct);
    }

    private static int countWords(String str) {
        String[] strArray = str.split(" ");
        return strArray.length;
    }
}
