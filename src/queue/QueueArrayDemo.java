package queue;

public class QueueArrayDemo {

    public static void main(String[] args) {
        QueueArray<Integer> queueArray = new QueueArray<>(5);
        queueArray.queue(1);
        queueArray.queue(2);
        queueArray.queue(3);
        queueArray.queue(4);
        queueArray.queue(5);
        queueArray.queue(6);
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.deQueue());
    }
}
