package org.example;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {0,1,1,2,8,1,1};
        int []res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = -1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    res[i] =arr[j];
                    break;
                }
            }
        }

        for(int i: res){
            System.out.println(i);
        }
    }
}
