package code._4_student_effort._4_genericc_iterator;

public interface IGenericNode<T>
{
    public T getValue();
    public void setValue(T value);
    public IGenericNode<T> getNext();
    public void setNext(IGenericNode<T> next);

}
