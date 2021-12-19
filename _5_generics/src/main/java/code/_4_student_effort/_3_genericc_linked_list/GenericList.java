package code._4_student_effort._3_genericc_linked_list;

public class GenericList<T> implements IGenericList<T>
{
    private IGenericNode<T> root;

    public GenericList(IGenericNode<T> node)
    {
        root.setValue(node.getValue());
        root.setNext(node.getNext());
    }
    public void insert(IGenericNode<T> node)
    {
        IGenericNode<T> cursor=root;
        while(cursor.getNext()!=null)
        {
            cursor=cursor.getNext();
        }
        IGenericNode<T> aux=new GenericNode<T>();
        aux.setValue(node.getValue());
        aux.setNext(null);
        cursor.setNext(aux);
    }
    public void println()
    {
        IGenericNode<T> cursor=root;
        while(cursor.getNext()!=null)
        {
            System.out.println(cursor.getValue());
            cursor=cursor.getNext();
        }
    }
    public IGenericNode<T> getRoot()
    {
        return root;
    }
}
