package code._4_student_effort._4_observer;

public interface ObservedSubject
{
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers(String message);
}
