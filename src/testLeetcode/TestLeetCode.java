package testLeetcode;

import java.util.PriorityQueue;

public class TestLeetCode {

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
            System.out.println(priorityQueue);
        }
        System.out.println(priorityQueue);
    }
}
