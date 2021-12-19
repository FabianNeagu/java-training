package code._4_student_effort._3_genericc_linked_list;

public class GenericNode<T> implements IGenericNode<T>
{
    private T value;
    private IGenericNode<T> next;

    public T getValue()
    {
        return value;
    }
    public IGenericNode<T> getNext()
    {
        return next;
    }
    public void setValue(T value)
    {
        this.value=value;
    }
    public void setNext(IGenericNode<T> next)
    {
        this.next=next;
    }
}
