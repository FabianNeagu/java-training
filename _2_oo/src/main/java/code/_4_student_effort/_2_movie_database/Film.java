package code._4_student_effort._2_movie_database;

public class Film
{
    protected String nume;
    protected int anAparitie;
    protected Actor [] actori;

    public Film()
    {
        nume="";
        anAparitie=0;
        actori=null;
    }
    public Film(String n,int an,Actor [] a)
    {
        nume=n;
        anAparitie=an;
        actori=a;
    }
    public Actor[] getActori()
    {
        return actori;
    }
    public String getNume()
    {
        return nume;
    }
    public void afisare()
    {
        System.out.println("Film: Nume: "+nume+" / An: "+anAparitie);
        for(int i=0;i<actori.length;i++)
        {
            actori[i].afisare();
        }
    }
}
