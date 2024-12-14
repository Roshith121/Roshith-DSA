package org.example;

public class ReplaceVowels {

    public static void main(String[] args) {

        String str ="I LOVE MY INDIA ";
        System.out.println(replaceVowelsInString(str));
    }

    private static String replaceVowelsInString(String st) {
        if(st.length()==0){
            return st;
        }
        if(st.charAt(0)=='A'|| st.charAt(0)=='E'||st.charAt(0)=='I'||st.charAt(0)=='O'||st.charAt(0)=='U'){
            //
            return "*"+replaceVowelsInString(st.substring(1));
        }
        return st.charAt(0)+replaceVowelsInString(st.substring(1));
    }
}
