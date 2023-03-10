package hashTable;

public class HashTableArray<T> {
    public Entry[] arrayHash;
    public int size;

    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[size];
        for(int i = 0; i < size; i++) {
            arrayHash[i] = new Entry();
        }
    }

    public int getHash(int key) {
        return key%size;
    }

    public void put(int key, Object value) {
        int hashIndex = getHash(key);
        Entry arrayValue = arrayHash[hashIndex];
        Entry newItem = new Entry(key, value);
        newItem.next = arrayValue.next;
        arrayValue.next = newItem;
    }

    public T get(int key) {
        T value = null;
        int hashIndex = getHash(key);
        Entry arrayValue = arrayHash[hashIndex];
        while (arrayValue != null) {
            if(arrayValue.getKey() == key) {
                value = (T) arrayValue.value;
                break;
            }
            arrayValue = arrayValue.next;
        }
        return value;
    }
}
