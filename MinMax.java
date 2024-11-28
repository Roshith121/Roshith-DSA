package org.example;

public class MinMax {

    public static void main(String[] args){

        int []arr = {1,2,3,4,5,6,7,7,8,99,0,-13};
        if(arr.length!=0){
            int min = arr[0];
            int max= arr[0];
            for(int i=0;i<arr.length;i++){
                if(min>arr[i])
                    min=arr[i];
                if(max<arr[i])
                    max=arr[i];
            }
            System.out.println("min : "+min+"  max : "+max);
        }

    }
}
