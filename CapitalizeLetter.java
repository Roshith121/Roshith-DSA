package org.example;

public class CapitalizeLetter {

    public static void main(String[] args) {
        String str ="i love india";
        String[] strarray = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word: strarray){
            result.append(Character.toTitleCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(result);
        }
}
