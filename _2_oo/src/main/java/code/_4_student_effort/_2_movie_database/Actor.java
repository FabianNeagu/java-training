package code._4_student_effort._2_movie_database;

public class Actor
{
    protected String nume;
    protected int varsta;
    protected Premiu [] premii;

    public Actor()
    {
        nume="";
        varsta=0;
        premii=null;
    }
    public Actor(String s,int v,Premiu [] p)
    {
        nume=s;
        varsta=v;
       premii=p;
    }
    public String getNume()
    {
        return nume;
    }
    public int getVarsta()
    {
        return varsta;
    }
    public void afisare()
    {
        System.out.println("Actor: Nume"+nume+" / Varsta:"+varsta);
        for(int i=0;i< premii.length;i++)
        {
            premii[i].afisare();
        }
    }
}
