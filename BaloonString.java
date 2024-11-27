package com.rr.rev.stream.api;

public class BaloonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baloonString ="balloonballoonballoon";
		System.out.println("baloonString : "+ballonCount(baloonString));
		
		
 
	    }
    static int ballonCount(String str) { 	
        
        int b =0;
        int a =0;
        int l =0;
        int o =0;
        int n =0;
        for(char ch: str.toCharArray()) {
        	if(ch=='b')
        		b++;
        	if(ch=='a')
        		a++;
        	if(ch=='l')
        		l++;
        	if(ch=='o')
        		o++;
        	if(ch=='n')
        		n++;	
        }
        
        int singleNumber = Math.min(b, Math.min(a, n));
        int doubleNumber = Math.min(l, o);
        
        int actualDouble = doubleNumber/2;
        return Math.min(singleNumber, actualDouble);
    }
}