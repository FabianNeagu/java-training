package code._4_student_effort._3_animal_hierarchy;

public class Fish extends Animal implements Pet
{
    protected String name;

    public Fish(String name)
    {
        super(0);
        this.name=name;
    }
    public Fish()
    {
        this("");
    }
    public void eat()
    {
        System.out.println("Mananca aleg");
    }
    public void walk()
    {
        System.out.println("Nu mereg, doar inoata");
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void play()
    {
        System.out.println("Se joaca in apa singur");
    }
}
