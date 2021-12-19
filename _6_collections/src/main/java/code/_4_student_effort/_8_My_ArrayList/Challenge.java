package code._4_student_effort._8_My_ArrayList;

public class Challenge
{
    public static void main(String[] args)
    {
        MyArrayList<Integer> list=new MyArrayListImpl<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.set(1,0);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+ "  ");
        }
    }
}
