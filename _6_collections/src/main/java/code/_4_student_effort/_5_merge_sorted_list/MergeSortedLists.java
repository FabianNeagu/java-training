package code._4_student_effort._5_merge_sorted_list;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MergeSortedLists
{
    public static void main(String[] args)
    {
        List<Integer> list1 = asList(1, 2, 3, 4, 5,12,13,13);
        List<Integer> list2 = asList(3, 4, 5, 6, 7, 8, 9, 10,11,23);
        List<Integer> list3 = mergeSortedLists(list1,list2);
        afisare(list3);
    }
    public static List<Integer> mergeSortedLists(List<Integer> list1,List<Integer> list2)
    {
        List<Integer> list=new ArrayList<>();
        Integer index1=0;
        Integer index2=0;
        while(list.size()!=list1.size()+list2.size() && index1!=list1.size() && index2!=list2.size())
        {
            if(list1.get(index1)<list2.get(index2))
            {
                list.add(list1.get(index1));
                index1++;
            }
            else
            {
                list.add(list2.get(index2));
                index2++;
            }
        }
        System.out.println(index1+" "+index2);
        if(index1==list1.size())
        {
            for(int j=index2;j<list2.size();j++)
                list.add(list2.get(j));
        }
        if(index2==list2.size())
        {
            for(int j=index1;j<list1.size();j++)
                list.add(list2.get(j));
        }
        return list;
    }
    public static void afisare(List<Integer> list)
    {
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" , ");
    }
}
