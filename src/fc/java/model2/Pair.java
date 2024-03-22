package fc.java.model2;

public class Pair<K,V> {
    //유연성, 재사용성, 타입 안전성 보장
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }


    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
