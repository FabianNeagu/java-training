package code._4_student_effort._1_two_fighters;

public class BoxingMatch
{
    protected Fighter f1,f2;

    public BoxingMatch(Fighter f1,Fighter f2)
    {
        this.f1=f1;
        this.f2=f2;
    }

    public BoxingMatch()
    {
        f1=new Fighter();
        f2=new Fighter();
    }
    public String fight()
    {
        while(f1.health!=0&&f2.health!=0)
        {
            f1.attack(f2);
            if(f2.health==0)
                return f1.name;
            f2.attack(f1);
            if(f1.health==0)
                return f2.name;
        }
        return f1.name;
    }
}
