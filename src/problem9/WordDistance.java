package problem9;

import java.util.Stack;

public class WordDistance {

    public static void main(String[] args) {

        //Found the path to find the Path from start word to end word by change one character
        String[] dic = {"hot","dot","dog","lot","log","cog"};
        String startWord = "hot";
        String endWord = "cog";
        boolean isFound = new WordDistance().findPath(dic, startWord, endWord);
        System.out.println("isFound: " + isFound);
    }

    boolean findPath(String[] dic, String startWord, String endWord) {
        boolean isFound = false;
        boolean[] isVisited = new boolean[dic.length];
        Stack<String> stack = new Stack<>();
        stack.push(startWord);
        while(!stack.isEmpty()) {
            String word = stack.pop();
            if(distanceWord(word, endWord) == 0) {
                stack.push(word);
                isFound = true;
                break;
            }

            for(int i = 0 ; i < dic.length; i++) {
                if (isVisited[i]) {
                    continue;
                }
                if(distanceWord(word, dic[i]) == 1) {
                    isVisited[i] = true;
                    stack.push(dic[i]);
                }
            }
        }
        return isFound;
    }

    int distanceWord(String word1, String word2) {
        int distance = 3;
        for(int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i) == word2.charAt(i)) {
                distance--;
            }
        }
        return distance;
    }
}
