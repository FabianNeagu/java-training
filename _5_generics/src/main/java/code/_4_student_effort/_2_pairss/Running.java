package code._4_student_effort._2_pairss;

public class Running implements Shoe
{
    private double size;
    private String color;

    public Running(double size,String color)
    {
        this.size=size;
        this.color=color;
    }

    public Running()
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
