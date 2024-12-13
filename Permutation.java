package org.example;

public class Permutation {

    public static void main(String[] args) {

        StringBuilder stbuilder = new StringBuilder("abc");
        permutation(stbuilder,0);
    }
    
    private static void permutation(StringBuilder st, int index) {
        if(index==st.length()){
            System.out.println(st);
            return;
        }
        for(int i =index;i<st.length();i++){
            swap(st,index,i);
            permutation(st,index+1);
            swap(st,index,i);
        }
    }

    private static void swap(StringBuilder st, int index, int i) {
        char temp = st.charAt(i);
        st.setCharAt(i,st.charAt(index));
        st.setCharAt(index,temp);
    }
}
