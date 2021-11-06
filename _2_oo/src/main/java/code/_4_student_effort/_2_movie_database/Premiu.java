package code._4_student_effort._2_movie_database;

public class Premiu
{
    protected String nume;
    protected int an;

    public Premiu()
    {
        nume="";
        an=0;
    }
    public Premiu(String n, int a)
    {
        nume=n;
        an=a;
    }
    public void afisare()
    {
        System.out.println("Premiu: Nume: "+nume+" / An:"+an);
    }

}

