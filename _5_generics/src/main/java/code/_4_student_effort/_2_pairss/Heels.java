package code._4_student_effort._2_pairss;

public class Heels implements Shoe
{
    private double size;
    private String color;

    public Heels(double size,String color)
    {
        this.size=size;
        this.color=color;
    }
    public Heels()
    {
        this(0,"");
    }
    public double getSize()
    {
        return size;
    }
    public String getColor()
    {
        return color;
    }
}
