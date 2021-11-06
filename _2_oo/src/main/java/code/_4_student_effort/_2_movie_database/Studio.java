package code._4_student_effort._2_movie_database;

public class Studio
{
    protected String nume;
    protected Film [] filme;

    public Studio()
    {
        nume="";
        filme=null;
    }

    public Studio(String n,Film [] f)
    {
        nume=n;
        filme=f;
    }

    public void afisare()
    {
        System.out.println("Studio: "+nume);
        for(int i=0;i< filme.length;i++)
        {
            filme[i].afisare();
        }
    }
    public Film[] getFilme()
    {
         return filme;
    }

    public String getNume()
    {
        return nume;
    }
}
