package problem11;

import java.util.PriorityQueue;
import java.util.Queue;

public class TopMoviesInStream {

    public static void main(String[] args) {
        int[] streamRating = {3,6,5,2,6,5,1,1,5};

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //find top 3
        int k = 3;
        for(int i = 0; i <streamRating.length; i++) {
            queue.add(streamRating[i]);
            if (queue.size() > k) {
                queue.poll();
            }
            System.out.println(queue);
        }
        System.out.println(queue);
    }
}
