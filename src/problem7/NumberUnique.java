package problem7;

import java.util.ArrayList;
import java.util.HashMap;

public class NumberUnique {

    public static void main(String[] args) {
        int[] array = {1,3,5,5,6,6,7,8,10,10};
        ArrayList<Integer> listNumber = new NumberUnique().getUniqueNumber(array);
        for(Integer number : listNumber) {
            System.out.println(number);
        }
    }

    //My answer
    ArrayList<Integer> getUniqueNumber(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> listUniqueNumber = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            int freq = map.getOrDefault(array[i], 0);
            freq++;
            map.put(array[i], freq);
        }
        for(Integer number : map.keySet()) {
            if(map.get(number) == 1) {
                listUniqueNumber.add(number);
            }
        }
        return listUniqueNumber;
    }
}
