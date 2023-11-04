package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static Map<Character, Integer> count(String str) {
    Map<Character,Integer> result = new HashMap<>();
        for (char c:str.toCharArray()) {
            if (result.containsKey(c)) {
                result.computeIfPresent(c, (k, v) -> v+1);
            } else result.put(c, 1);
        }
        return result;
    }
}