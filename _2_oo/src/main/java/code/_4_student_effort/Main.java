package code._4_student_effort;

import code._4_student_effort._2_movie_database.Actor;
import code._4_student_effort._2_movie_database.Film;
import code._4_student_effort._2_movie_database.Studio;
import code._4_student_effort._2_movie_database.Premiu;
import code._4_student_effort._1_two_fighters.BoxingMatch;
import code._4_student_effort._1_two_fighters.Fighter;

public class Main {

    public static void main(String[] args)
    {
        Fighter f1=new Fighter("Fabian",100,30);
        Fighter f2=new Fighter("Andra",70,20);
        BoxingMatch match1=new BoxingMatch(f1,f2);
        BoxingMatch matche2=new BoxingMatch();
        String winner=match1.fight();
        System.out.println("Castigatorul meciului este "+ winner);

        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);
        Premiu p=new Premiu();

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55,new Premiu []{oscar2000,oscar1990});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018,oscar2010,oscar2000});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{oscar2000,oscar1990});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

        Film film1 = new Film("a", 12, new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film("d", 23, new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film("d", 44, new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film("c", 55, new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film("s", 66, new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        //studio1.afisare();
        //studio_with_Moreth2_movies(studioDatabase);
        ex_2(studioDatabase);
        ex_3(studioDatabase);
    }
    public static void studio_with_Moreth2_movies(Studio [] v)
    {
        for(int i=0;i<v.length;i++)
            if(v[i].getFilme().length>=2)
                System.out.println(v[i].getNume());
    }
    public static void ex_2(Studio [] v)
    {
        for(int i=0;i<v.length;i++)
            for(int j=0;j<v[i].getFilme().length;j++)
                for(int k=0;k<v[i].getFilme()[j].getActori().length;k++)
                    if(v[i].getFilme()[j].getActori()[k].getNume().equals("actor cu 2 oscaruri"))
                        System.out.println(v[i].getNume());

    }
    public static void ex_3(Studio [] v)
    {
        for(int i=0;i<v.length;i++)
            for(int j=0;j<v[i].getFilme().length;j++)
            {
                boolean exista = false;
                for (int k = 0; k < v[i].getFilme()[j].getActori().length; k++)
                {
                    if (v[i].getFilme()[j].getActori()[k].getVarsta()> 50)
                        exista = true;
                    if (exista)
                    {System.out.println(v[i].getFilme()[j].getNume());
                    break;}
                }
            }
    }
}
