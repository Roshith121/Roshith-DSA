package org.example;

public class StackImplementation {

    public static void main(String[] args) {

        int n = 5;
        StackCommon st = new StackCommon(n);
        st.push(5);
        st.push(4);
        st.push(2);
        st.push(6);

    while(!st.isempty()){
        System.out.println(st.pop());
    }
        System.out.println(st.isempty());
    }
}
