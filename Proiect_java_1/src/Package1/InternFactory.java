package Package1;

import java.util.Scanner;

public class InternFactory implements HumanAbstractFactory
{
    public Observer createObserver()
    {
        System.out.println("Introduceti date despre un nou intern");
        Scanner input=new Scanner(System.in);
        System.out.println("Nume;");
        String n=input.next();
        System.out.println("Facultate");
        String f=input.next();
        System.out.println("Varsta:");
        Integer v=input.nextInt();
        System.out.println("Experienta:(True/False) ");
        boolean e=input.nextBoolean();
        System.out.println("Nume Supervisor:");
        String sup=input.next();
        return new Intern(n,f,v,e,sup,"");
    }

    @Override
    public ObservedSubject createObservedSubject() {
        return null;
    }
}
