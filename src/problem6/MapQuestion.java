package problem6;

import java.util.HashMap;

public class MapQuestion {

    int longestSubstring(String text) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = map.getOrDefault(c, -1);
            if(index != -1) {
                int len = i - index;
                maxLen = Math.max(len, maxLen);
            }

            map.put(c, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String text = "abcdefabcdefghia";
        int freq = new MapQuestion().longestSubstring(text);
        System.out.println("F = " + freq);
    }
}
