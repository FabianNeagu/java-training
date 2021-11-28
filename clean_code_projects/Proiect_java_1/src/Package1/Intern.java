package Package1;

public class Intern implements Observer
{
    private String nume;
    private String facultate;
    private Integer varsta;
    private boolean experientaAnterioara;
    private String sup;
    String feedback;

    public Intern(String n,String f,Integer v,boolean e,String s,String fdb)
    {
        nume=n;
        facultate=f;
        varsta=v;
        experientaAnterioara=e;
        sup=s;
        feedback=fdb;
    }
    public Intern()
    {
        this("","",0,false,"","");
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
