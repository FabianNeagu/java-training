package Package1;

import java.util.Scanner;

public class SupervisorFactory implements HumanAbstractFactory
{
    public ObservedSubject createObservedSubject()
    {
        System.out.println("Introduceti date despre nou Supervisor:");
        Scanner input=new Scanner(System.in);
        System.out.println("Nume:");
        String nume=input.next();
        System.out.println("Departament: ");
        String dep=input.next();
        System.out.println("Varsta: ");
        Integer v=input.nextInt();
        return new Supervisor(nume,dep,v);
    }

    @Override
    public Observer createObserver() {
        return null;
    }
}
