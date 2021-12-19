package code._4_student_effort._1_exchange_desk;

public class Ron extends Currency
{
    public Ron()
    {
        super();
    }
    public Ron(double units)
    {
        super(units);
    }

    @Override
    public void setUnits(double units)
    {
        super.setUnits(units);
    }
    public double getUnits()
    {
        return super.getUnits();
    }
    public String toString()
    {
        return this.getUnits()+"lei";
    }
}
