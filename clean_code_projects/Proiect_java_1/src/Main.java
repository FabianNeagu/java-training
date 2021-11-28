import Package1.*;

public class Main
{
    public static void main(String[] args)
    {
        ObservedSubject supervisor1= HumanFactory.getObservedSubject(new SupervisorFactory());
        Observer intern1=HumanFactory.getObserver(new InternFactory());
        Observer  employee1=HumanFactory.getObserver(new EmployeeFactory());
        supervisor1.register(intern1);
        supervisor1.register(employee1);
        supervisor1.notify("Excellent work!");
        System.out.println("Feedback-ul intern-ului si al angajatului este:");
        System.out.println(intern1.getFeedback());
    }
}
