package Package1;

import java.util.Scanner;

public class EmployeeFactory implements HumanAbstractFactory
{
    public Observer createObserver()
    {
        System.out.println("Introduceti date despre un nou angajat");
        Scanner input=new Scanner(System.in);
        System.out.println("Nume;");
        String n=input.next();
        System.out.println("Varsta");
        Integer v=input.nextInt();
        System.out.println("Specializare:");
        String s=input.next();
        System.out.println("Ani_Experienta: ");
        Integer ani=input.nextInt();
        System.out.println("Nume Supervisor:");
        String sup=input.next();
        return new Employee(n,v,s,ani,sup,"");
    }

    @Override
    public ObservedSubject createObservedSubject() {
        return null;
    }
}
