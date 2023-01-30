package queue;

public class QueueArray<T> {

    public Object[] queueArray;
    public int front;
    public int rear;
    public int size;
    public QueueArray(int size) {
        this.size = size;
        queueArray = new Object[this.size];
        front = -1;
        rear = -1;
    }

    public void queue(Object newItem) {
        if(isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear++;
        queueArray[rear] = newItem;
        if(front == -1) {
            front = 0;
        }
    }

    public T deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        T value = (T) queueArray[front];
        front++;
        return value;

    }

    public boolean isFull() {
        return (rear == size - 1);
    }

    public boolean isEmpty() {
        return (front == -1 || front > rear);
    }

}
