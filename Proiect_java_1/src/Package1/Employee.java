package Package1;

public class Employee implements Observer
{
    private String nume;
    private Integer varsta;
    private String specializare;
    private Integer aniExperienta;
    private String sup;
    private String feedback;

    public Employee(String n,Integer v,String spec,Integer a,String suup,String fdb)
    {
        nume=n;
        varsta=v;
        specializare=spec;
        aniExperienta=a;
        sup=suup;
        feedback=fdb;
    }
    public Employee()
    {
        this("",0,"",0,"","");
    }
    public void update(String message)
    {
        feedback=message;
    }
    public String getFeedback()
    {
        return feedback;
    }
}
