package problem5;

import java.util.HashMap;

public class MapQuestion {

    int firstUniqChar(String text) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int freq = map.getOrDefault(c, 0);
            freq++;
            map.put(c, freq);
        }
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "loveworklaterv";
        int freq = new MapQuestion().firstUniqChar(text);
        System.out.println("F = " + freq);
    }
}
