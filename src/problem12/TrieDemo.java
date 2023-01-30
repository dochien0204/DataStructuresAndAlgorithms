package problem12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TrieDemo {

    HashMap<String, ArrayList<String>> buildMap(String[] wordDB) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String word : wordDB) {
            for(int endIndex = 0; endIndex < word.length(); endIndex++) {
                String key = word.substring(0, endIndex);
                ArrayList<String> list = map.getOrDefault(key, new ArrayList<String>());
                list.add(word);
                map.put(key, list);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] wordDB = {"food", "book", "fool", "full", "word", "fast"};
        Scanner sc = new Scanner(System.in);
        TrieDemo trieDemo = new TrieDemo();
        HashMap<String, ArrayList<String>> mapDB = trieDemo.buildMap(wordDB);
        while (true) {
            System.out.print("Search Text : " );
            String searchText = sc.nextLine();
            System.out.println(mapDB.get(searchText));
        }
    }
}
