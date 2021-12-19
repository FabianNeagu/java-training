package code._4_student_effort._4_genericc_iterator;

public class Example1
{
    public static void main(String[] args)
    {
        Integer [] arr1=new Integer[4];
        arr1[0]=0;
        arr1[1]=1;
        arr1[2]=2;
        arr1[3]=3;
        IArrayIterator<Integer> it=new ArrayIterator<Integer>(arr1);
        while(it.hasNext())
            System.out.println(it.next());
    }
}
