package org.example;

public class ReverseAString {

    public static void main(String[] args) {
    char[] s = {'h','e','l','l','o'};
        System.out.println(s);
        char[] reverseArr = reverseString(s);
        for(char ch:reverseArr){
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("with new char variable ");
        System.out.println(reverseStringGreedy(s));
    }

    //greedy algo
    public static char[] reverseStringGreedy(char[] s) {
        String reverseS="";
        for(int i=s.length-1;i>=0;i--){
            reverseS+=s[i];
        }
        return reverseS.toCharArray();
    }

    //best approach
    public static char[] reverseString(char[] s) {

        int right = s.length-1;
        int left = 0;
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            right--;
            left++;
        }
        return s;
    }
}
