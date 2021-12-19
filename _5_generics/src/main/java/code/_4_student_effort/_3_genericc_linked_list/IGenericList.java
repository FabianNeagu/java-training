package code._4_student_effort._3_genericc_linked_list;

public interface IGenericList<T>
{
    public void insert(IGenericNode<T> node);
    public void println();
    public IGenericNode<T> getRoot();
}
