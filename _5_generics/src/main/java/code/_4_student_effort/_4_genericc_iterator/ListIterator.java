package code._4_student_effort._4_genericc_iterator;

import code._2_challenge._3_generic_linked_list.IGenericList;
import code._4_student_effort._3_genericc_linked_list.GenericList;
import code._4_student_effort._3_genericc_linked_list.GenericNode;

public class ListIterator<T> implements IArrayIterator<T>
{
    IGenericNode<T> cursor;
    IGenericList<T> list;

    public ListIterator(IGenericList list1)
    {
        list=list1;
        cursor=list.getRoot();
    }
    public boolean hasNext()
    {
        cursor=cursor.getNext();
        if(cursor!=null)
            return true;
        else
            return false;
    }
    public T next()
    {
        return cursor.getValue();
    }
}
