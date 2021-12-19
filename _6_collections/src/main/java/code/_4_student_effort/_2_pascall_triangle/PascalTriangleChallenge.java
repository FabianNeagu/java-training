package code._4_student_effort._2_pascall_triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleChallenge
{
    public static void main(String[] args)
    {
        List<List<Integer>> list=generatePascalTriangle(8);
        afisare(list);

    }
    public static List<List<Integer>> generatePascalTriangle(int n)
    {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            triangle.add(new ArrayList<>());
            triangle.get(i).add(1);
            if((i!=0)&&(i!=1))
            {
                if (triangle.get(i - 1).size() >= 2)
                {
                    for (int k = 0; k < triangle.get(i - 1).size() - 1; k++)
                    {
                        Integer sum = triangle.get(i - 1).get(k) + triangle.get(i - 1).get(k + 1);
                        triangle.get(i).add(sum);
                    }
                }
            }
            if(i!=0)
                triangle.get(i).add(1);
        }
        return triangle;
    }
    public static void afisare(List<List<Integer>> list)
    {
        for(int i=0;i<list.size();i++)
        {
            for (int j = 0; j < list.get(i).size(); j++)
                System.out.print(list.get(i).get(j) + "  ");
            System.out.println("");
        }
    }
}
