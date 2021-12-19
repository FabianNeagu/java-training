package code._4_student_effort._2_pairss;

import java.awt.*;

public class Pair <T extends Shoe>
{
    private T firstObject;
    private T secondObject;

    public Pair(T firstObject,T secondObject)
    {
        this.firstObject=firstObject;
        this.secondObject=secondObject;
        this.match(firstObject,secondObject);
    }
    public void match(T firstObject,T secondObject)
    {
        if(!firstObject.getColor().equals(secondObject.getColor()))
            throw new SizeDoNotMatchException("Size do not martch!");
        if(firstObject.getSize()!=secondObject.getSize())
            throw new ColorDoesNotMatchException("Color does not match!");
    }
    public T getFirstObject()
    {
        return firstObject;
    }
    public T getSecondObject()
    {
        return secondObject;
    }
}
