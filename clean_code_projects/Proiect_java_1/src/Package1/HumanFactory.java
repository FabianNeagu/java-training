package Package1;

public class HumanFactory
{
    public static ObservedSubject getObservedSubject(HumanAbstractFactory h)
    {
        return h.createObservedSubject();
    }
    public static Observer getObserver(HumanAbstractFactory h)
    {
        return h.createObserver();
    }
}
