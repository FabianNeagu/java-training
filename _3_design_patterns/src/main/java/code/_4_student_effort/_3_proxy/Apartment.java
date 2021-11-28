package code._4_student_effort._3_proxy;

public class Apartment
{
    private String location;
    private int monthlyRentCost;

    public Apartment(String a, int b)
    {
        location=a;
        monthlyRentCost=b;
    }
    public Apartment()
    {
        this("",0);
    }
    public int getMonthlyRentCost()
    {
        return monthlyRentCost;
    }
}
