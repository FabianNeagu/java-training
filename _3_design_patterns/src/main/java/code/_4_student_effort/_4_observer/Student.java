package code._4_student_effort._4_observer;

public class Student implements Observer
{
    private String name;

    public Student(String m)
    {
        name=m;
    }
    public Student()
    {
        this("");
    }
    public void listenTo(Teacher t)
    {
        t.register(this);
    }
    public void update(String message)
    {
        System.out.println("Studentul "+name+" a invata astazi despre "+message);
    }
}
