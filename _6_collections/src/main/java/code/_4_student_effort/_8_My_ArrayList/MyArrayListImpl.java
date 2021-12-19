package code._4_student_effort._8_My_ArrayList;

import java.util.Arrays;

public class MyArrayListImpl<T> implements MyArrayList<T>
{
    private Object[] list=new Object[0];

    public void add(T e)
    {
        list= Arrays.copyOf(list,list.length+1);
        list[list.length-1]=e;
    }
    public void remove(T e)
    {
        for(int i=0;i<list.length;i++)
        {
            if(list[i].equals(e))
            {
                System.arraycopy(list,i+1,list,i,list.length-i-1);
            }
        }
    }
    public T get(int index)
    {
        return (T) list[index];
    }
    public void set(int index,T e)
    {
        list[index]=e;
    }
    public int size()
    {
        return list.length;
    }
}
