package code._4_student_effort._4_observer;

import java.util.Arrays;

public class Teacher implements ObservedSubject
{
    private Observer [] observers=new Observer[0];

    public void register(Observer obj)
    {
        observers= Arrays.copyOf(observers, observers.length+1);
        observers[observers.length-1]=obj;
    }
    public void unregister(Observer obj)
    {
        int removeIndex=-1;
        for(int i=0;i<observers.length;i++)
            if(observers[i].equals(obj))
            {
                removeIndex=i;
            }
        System.arraycopy(observers,removeIndex+1,observers,removeIndex,observers.length-removeIndex-1);
    }
    public void notifyObservers(String message)
    {
        for(int i=0;i< observers.length;i++)
        {
            observers[i].update((message));
        }
    }
}
