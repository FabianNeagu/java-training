package code._4_student_effort._4_genericc_iterator;

import java.lang.reflect.Array;

public class ArrayIterator<T> implements IArrayIterator<T>
{
    private Integer index;
    private T [] array;

    public ArrayIterator(T [] array)
    {
        index=0;
        this.array=array;
    }

    @Override
    public boolean hasNext()
    {
        if(index< array.length)
            return true;
        else
            return false;
    }
    public T next()
    {
        return array[index++];
    }
}
