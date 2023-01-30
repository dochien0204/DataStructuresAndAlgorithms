package stack;

public class StackArrayDemo {
    public static void main(String[] args) {
        StackArray<Integer> stackArray = new StackArray<>(5);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.push(6);
        while (!stackArray.isEmpty()) {
            System.out.println(stackArray.pop());
        }
    }
}
