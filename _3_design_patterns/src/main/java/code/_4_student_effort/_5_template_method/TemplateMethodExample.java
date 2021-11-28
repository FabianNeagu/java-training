package code._4_student_effort._5_template_method;

import java.util.Arrays;

public class TemplateMethodExample
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        int[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        int[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc=new AscBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc=new DescBubbleSort();
        desc.sort(copy02OfArr);
        afiseaza(copy01OfArr);
        System.out.println();
        afiseaza(copy02OfArr);
    }
    public static void afiseaza(int [] v)
    {
        for(int i=0;i<v.length;i++)
            System.out.print(v[i]+" , ");
    }
}
