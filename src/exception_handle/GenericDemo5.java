package exception_handle;

public class GenericDemo5 {
    public static void main(String[] args) {
        Entry<Integer , String> e1 = new Entry<>(1, "홍길동");
        System.out.println(e1.getKey());
        System.out.println(e1.getValue());

        Entry<String, Integer> e2 = new Entry<>("Apple", 3);
        System.out.println(e2.getKey());
        System.out.println(e2.getValue());
    }
}

class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key,V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }

    public V getValue() {
        return value;
    }
}