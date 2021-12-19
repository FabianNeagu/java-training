package code._4_student_effort._2_pairss;

public class Boot implements Shoe
{
    private double size;
    private String color;

    public Boot(double size,String color)
    {
        this.size=size;
        this.color=color;
    }
    public Boot()
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
