package code._4_student_effort._3_bell_triangle;

import java.util.ArrayList;
import java.util.List;

public class BellTriangleChallenge
{
    public static void main(String[] args)
    {
        List<List<Integer>> list=generateBellTriangle(5);
        afisare(list);
    }
    public static List<List<Integer>> generateBellTriangle(Integer n)
    {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            triangle.add(new ArrayList<>());
            if (i == 0)
                triangle.get(i).add(1);
            if(i!=0)
            {
                triangle.get(i).add(triangle.get(i-1).get(triangle.get(i-1).size()-1));
                for(int j=0;j<triangle.get(i-1).size();j++)
                {
                    Integer sum;
                    sum=triangle.get(i-1).get(j)+triangle.get(i).get(j);
                    triangle.get(i).add(sum);
                }
            }
        }
        return triangle;
    }
    public static void afisare(List<List<Integer>> list)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.get(i).size();j++)
                System.out.print(list.get(i).get(j)+"  ");
            System.out.println("");
        }
        }
}
