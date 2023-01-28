package linkedListProblem;

public class LinkedListManager {
    public static void main(String[] args) {
        LinkedListU<Integer> listU = new LinkedListU<>();
        listU.add(1);
        listU.add(2);
        listU.add(3);
        listU.add(4);
        listU.add(5);
        listU.add(6);
        listU.display();
        System.out.println("After delete");
        deleteKthElement(listU.head, 2);
        listU.display();
    }

    public static void deleteKthElement(ListNode root, int k) {
        ListNode slowPtr = root;
        ListNode fastPtr = root;
        if (k == 6) {
            root = root.next;
        } else {

            while (k > 0) {
                fastPtr = fastPtr.next;
                k--;
            }

            while (fastPtr.next != null) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
            slowPtr.next = slowPtr.next.next;
        }

    }
}
