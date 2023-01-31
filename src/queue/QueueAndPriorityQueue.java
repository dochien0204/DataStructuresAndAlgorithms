package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAndPriorityQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(15);
        q.add(11);
        q.add(13);
        q.add(12);
        System.out.println(q.poll());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(11);
        pq.add(13);
        pq.add(12);
        System.out.println(pq.poll());

        PriorityQueue<Student> studentsPQ = new PriorityQueue<>();
        studentsPQ.add(new Student("Chien", 20));
        studentsPQ.add(new Student("Chin", 25));
        studentsPQ.add(new Student("Chen", 10));
        studentsPQ.add(new Student("Chn", 30));
        System.out.println(studentsPQ.poll().name);
    }
}
