package code._4_student_effort.FooBarQix;

public class FooBarQix
{
    public String compute(int n)
    {
        String s="";
        int nr1;
        int nr2;

        nr1=se_divide(n,3);
        for(int i=0;i<nr1;i++)
            s=s+"FOO";
        nr2=se_gaseste(n,3);
        for(int i=0;i<nr2;i++)
            s=s+"FOO";

        nr1=se_divide(n,5);
        for(int i=0;i<nr1;i++)
            s=s+"BAR";
        nr2=se_gaseste(n,5);
        for(int i=0;i<nr2;i++)
            s=s+"BAR";

        nr1=se_divide(n,7);
        for(int i=0;i<nr1;i++)
            s=s+"QIX";
        nr2=se_gaseste(n,7);
        for(int i=0;i<nr2;i++)
            s=s+"QIX";

        return s;
    }
    public int se_divide(int n,int a)
    {
        int nr=0;
        while(n!=0)
        {
            if(n%a==0)
                nr++;
            n=n/10;
        }
        return nr;
    }
    public int se_gaseste(int n,int a)
    {
        int nr=0;
        while(n!=0)
        {
            if(n%10==a)
                nr++;
            n=n/10;
        }
        return  nr;
    }
}
