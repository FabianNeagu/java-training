package code._4_student_effort.FizzBuzz;

public class FizzBuzz
{
        public void FizzBuzz(int n)
        {
            for(int i=0;i<n;i++)
            {
                if(i%3==0) System.out.print("Fizz");
                if(i%5==0) System.out.print("Buzz");
                if(i%3!=0&&i%5!=0)
                    System.out.print(i);
                System.out.print(" , ");
            }
        }

}
