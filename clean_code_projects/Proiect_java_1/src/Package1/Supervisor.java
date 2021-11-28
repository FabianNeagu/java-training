package Package1;

import java.util.Arrays;

public class Supervisor implements ObservedSubject
{
    private Observer[] observers=new Observer[0];

    private String nume;
    private String departament;
    private Integer varsta;

    public Supervisor(String n,String d,Integer v)
    {
        nume=n;
        departament=d;
        varsta=v;
    }
    public Supervisor()
    {
        this("","",0);
    }

    public void register(Observer obs)
    {
        this.observers= Arrays.copyOf(observers,observers.length+1);
        observers[this.observers.length-1]=obs;
    }
    public void unregister(Observer obs)
    {
        int removedIndex=-1;
        for(int i=0;i< observers.length;i++)
        {
            if(observers[i].equals(obs))
            {
                removedIndex = i;
                break;
            }
        }
        System.arraycopy(observers,removedIndex+1,observers,removedIndex,observers.length-removedIndex-1);
    }

    public void notify(String message)
    {
        for(int i=0;i<observers.length;i++)
        {
            observers[i].update(message);
        }
    }
}
