package baitap2;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        String stringTest = "addudududu";
        TreeMap<Character, Integer> readWord = new TreeMap<>();
        for (int i = 0; i < stringTest.length(); i++) {
            char testStringEachChar = stringTest.charAt(i);
            if(readWord.get(testStringEachChar) == null)
                readWord.put(testStringEachChar ,1);
            else
                readWord.replace(testStringEachChar, readWord.get(testStringEachChar) + 1);
        }
    }
}
