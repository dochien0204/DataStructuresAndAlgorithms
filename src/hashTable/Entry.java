package hashTable;

public class Entry {
    public int key;
    public Object value;
    public Entry next;
    public Entry(int key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public Entry() {
        this.next = null;
    }
    public int getKey() {
        return key;
    }
}
