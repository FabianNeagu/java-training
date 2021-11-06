package code._4_student_effort._3_animal_hierarchy;

public class Cat extends Animal implements Pet
{
    protected String name;

    public Cat()
    {
        this("");
    }
    public Cat(String nume)
    {
        super(4);
        name=nume;
    }
    public void eat()
    {
        System.out.println("Pisica mananca soareci!");
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void play()
    {
        System.out.println("Se joaca cu mingea");
    }
}
