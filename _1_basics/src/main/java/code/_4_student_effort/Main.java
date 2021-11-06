package code._4_student_effort;

import code._4_student_effort.FizzBuzz.FizzBuzz;
import code._4_student_effort.FooBarQix.FooBarQix;
import code._4_student_effort.Pair_of_2.Pair_of_2;
import code._4_student_effort.Pair_of_3.Pair_of_3;

public class Main {

    public static void main(String[] args)
    {
        // Challenge 1 - verificare
        /*FizzBuzz obiect=new FizzBuzz();
        obiect.FizzBuzz(40);*/

        //Challenge 2 - verificare
        FooBarQix object2=new FooBarQix();
        for(int i=0;i<=15;i++)
        {
            String rez;
            rez=object2.compute(i);
            if(rez.equals(""))
                System.out.print(i+" , ");
            else
                System.out.print(rez+ " , ");
        }

        //Chalenge 3 - verficare
    /*    Pair_of_2 a=new Pair_of_2();
        int []v={1,2,3,2,-1,-2,-2,-2,-3};
        int nr=0;
        nr=a.nr_of_pairs(v);
        System.out.println("Nr de pereschi este de "+ nr);*/

        //Cjallenge 4 - Verificare
       /* Pair_of_3 p=new Pair_of_3();
        int []v={-1,-1,-1,2};
        int nr1=0;
        nr1=p.nr_of_pairs(v);
        System.out.println("Nr de pereschi este de "+ nr1);*/
    }
}
