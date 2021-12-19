package code._4_student_effort._7_my_hashhtable;

public class MyHashhTableImpl<K,V> implements MyHashhTable<K,V>
{
    private Object[] values = new Object[Integer.MAX_VALUE / 100];
    private int nrOfElements = 0;

    public V get(K key)
    {
        return (V) values[key.hashCode()];
    }
    public void put(K key, V value)
    {
        values[key.hashCode()]=value;
        nrOfElements++;
    }
    public void remove(K key)
    {
        values[key.hashCode()]=null;
    }
    public boolean containsKey(K key)
    {
        if(values[key.hashCode()]!=null)
            return true;
        else
            return true;
    }
    public int size()
    {
        return nrOfElements;
    }
}
