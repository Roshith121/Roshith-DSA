package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyForString {

    public static void main(String []args){
        String st="blablacarlabrac";
        Map<Character,Integer> frequencyMap = new LinkedHashMap<Character, Integer>();
        for(int i =0 ;i<st.length();i++){
            Character ch = st.charAt(i);
            if(frequencyMap.containsKey(ch)){
                frequencyMap.put(ch,frequencyMap.get(ch)+1);
            }
            else{
                frequencyMap.put(ch,1);
            }
        }
        System.out.println("characher :"+frequencyMap.keySet()+"frequency :"+frequencyMap.values());
    }
}
