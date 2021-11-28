package code._4_student_effort._2_strategy;

import java.util.Arrays;

public class StrategyExample
{
    public static void main(String[] args)
    {
        int [] arr=new int[] {1,4,5,2,3,6,9,8,7};
        int [] copy01ofArr= Arrays.copyOf(arr,arr.length);
        int [] copy02ofArr=Arrays.copyOf(arr,arr.length);
        displaySorted(new BubleSort(),copy01ofArr);
        displaySorted(new MergeSort(),copy02ofArr);
    }
    public static void displaySorted(SortingStrategy strategy,int [] v)
    {
        strategy.sort(v);
        for(int i=0;i<v.length;i++)
            System.out.println(v[i]);
    }
}
