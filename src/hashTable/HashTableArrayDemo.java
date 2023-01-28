package hashTable;

public class HashTableArrayDemo {
    public static void main(String[] args) {
        HashTableArray<String> array = new HashTableArray<>(4);
        array.put(1, "Do Chien");
        array.put(2, "Do Cong");
        array.put(3, "Chien Chien");
        array.put(4, "Do Do");
        System.out.println(array.get(2));
    }
}
