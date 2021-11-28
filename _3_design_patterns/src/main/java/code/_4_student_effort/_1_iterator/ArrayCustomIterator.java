package code._4_student_effort._1_iterator;

import java.lang.reflect.Array;

public class ArrayCustomIterator
{
    private int [] arr;
    private int currentindex;

    public ArrayCustomIterator(int [] arr)
    {
        this.arr=arr;
        this.currentindex=0;
    }
    public boolean hasnext()
    {
        if(this.currentindex!=this.arr.length)
            return true;
        return false;
    }
    public int next()
    {
        this.currentindex=this.currentindex+1;
        return this.arr[currentindex-1];
    }
}
