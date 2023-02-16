package review;

import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println("Missing Number: " + MissingNumber.missingNumber(new int[]{1,2,3,5}));
        System.out.println("Duplicate Numbers: " + MissingNumber.findDuplicateNumberInArray(new int[]{1,1,1,3,4,5,2,4,5,6}));
        System.out.println("Array after remove duplicate numbers: " + Arrays.toString(MissingNumber.removeDuplicateNumber(new int[]{1,1,1,3,4,5,2,4,5,6})));
        System.out.println("Array after remove duplicate elements: " + Arrays.toString(MissingNumber.removeDuplicateElement(new int[]{1,1,1,3,4,5,2,4,5,6})));

    }

    public static int missingNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int sumMax = 0;
        for (int i = 1; i <= max; i++) {
            sumMax += i;
        }
        return sumMax - sum;
    }

    public static List<Integer> findDuplicateNumberInArray (int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int freq = map.getOrDefault(arr[i], 0);
            if (freq != 0 && !list.contains(arr[i])) {
                list.add(arr[i]);
            }
            freq++;
            map.put(arr[i], freq);
        }
        return list;
    }

    public static int[] removeDuplicateNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> listRemove = new ArrayList<>();
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int freq = map.getOrDefault(arr[i], 0);
            freq++;
            map.put(arr[i], freq);
            if (freq == 1) {
                listRemove.add(arr[i]);
            }
        }
        result = listRemove.stream().mapToInt(i -> i).toArray();
        return result;
    }

    public static int[] removeDuplicateElement (int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int freq = map.getOrDefault(arr[i], 0);
            freq++;
            map.put(arr[i], freq);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }
        result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
