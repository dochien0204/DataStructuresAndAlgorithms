package linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("LinkedList U Demo");
        LinkedListU<String> listU = new LinkedListU<String>();
        listU.add("Do");
        listU.add("Chien");
        listU.display();
        listU.delete();
        listU.display();
        System.out.println();
        System.out.println("LinkedListDouble Demo");
        LinkedListD<String> listD = new LinkedListD<>();
        listD.add("Java");
        listD.add("Golang");
        listD.add("Docker");
        listD.display();
        listD.delete();
        listD.display();
    }
}
