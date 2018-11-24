package com.lits3;

import java.util.HashMap;
import java.util.Map;

public class app {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        String sentence = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";

        for (int i = 0; i < sentence.length(); i++) {
            if ( map.containsKey(sentence.charAt(i))) {
                map.put (sentence.charAt(i), map.get(sentence.charAt(i)) + 1 );
            } else {
                map.put (sentence.charAt(i), 1);
            }
        }
        map.remove(" ");
        map.remove(",");
        for(Map.Entry i : map.entrySet())
            System.out.println(i.getKey() + ": " + i.getValue());
    }
}
