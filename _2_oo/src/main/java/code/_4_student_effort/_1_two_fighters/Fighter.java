package code._4_student_effort._1_two_fighters;

public class Fighter
{
    protected String name;
    protected int health;
    protected int damagePerAttack;

    public Fighter()
    {
        super();
        name="";
        damagePerAttack=0;
        health=0;
    }
    public Fighter(String n,int h, int d)
    {
        name=n;
        health=h;
        damagePerAttack=d;
    }

    public void setName(String n)
    {
        name=n;
    }
    public void setHealth(int h)
    {
        health=h;
    }
    public void setDamagePerAttack(int d)
    {
        damagePerAttack=d;
    }
    public String getName()
    {
        return name;
    }
    public int getDamagePerAttack()
    {
        return damagePerAttack;
    }
    public int getHealth()
    {
        return health;
    }
    public void attack(Fighter f)
    {
        f.health=f.health-this.damagePerAttack;
        if(f.health<0)
            f.health=0;
    }
}
