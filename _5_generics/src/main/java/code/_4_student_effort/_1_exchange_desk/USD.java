package code._4_student_effort._1_exchange_desk;

public class USD extends Currency
{
    public USD()
    {
        super();
    }
    public USD(double units)
    {
        super(units);
    }
    public void setUnits(double units)
    {
        super.setUnits(units);
    }
    public String toString()
    {
        return getUnits()+"USD";
    }
}
