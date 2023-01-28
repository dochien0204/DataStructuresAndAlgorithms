package problem4;

import java.util.HashMap;

public class MapQuestion {
    String getMostCommonWord(String text) {
        String[] words = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < words.length; i++) {
            int freq = map.getOrDefault(words[i], 0);
            freq++;
            map.put(words[i], freq);
        }
        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;
        for(String key : map.keySet()) {
            int value = map.get(key);
            if(value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        String text = "Bob hit a ball the hit ball flew after it was hit";
        String freq = new MapQuestion().getMostCommonWord(text);
        System.out.println("F = " + freq);
    }
}
