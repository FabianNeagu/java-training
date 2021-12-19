package code._4_student_effort._7_my_hashhtable;

public interface MyHashhTable<K,V>
{
    public V get(K key);
    public void put(K key, V value);
    public void remove(K key);
    public boolean containsKey(K key);
    public int size();
}
