package code._4_student_effort._9_My_Set;

public interface MySet<T>
{
    public void add(T e);
    public void remove(T e);
    public T get(int index);
    public void set(int index,T e);
    public int size();
    public boolean contains(T e);
}
