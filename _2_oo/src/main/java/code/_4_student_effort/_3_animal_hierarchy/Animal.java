package code._4_student_effort._3_animal_hierarchy;

public abstract class Animal
{
    protected int legs;


    protected Animal()
    {
        legs=0;
    }
    protected Animal(int l)
    {
        legs=l;
    }
    public abstract void eat();
    public void walk()
    {
        System.out.println("Animalul merge folosind nr de picioare: "+legs);
    }
}
