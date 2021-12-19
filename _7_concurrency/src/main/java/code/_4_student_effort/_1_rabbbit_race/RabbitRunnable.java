package code._4_student_effort._1_rabbbit_race;

public class RabbitRunnable implements Runnable
{
    private int nr;

    public RabbitRunnable(int i)
    {
        nr=i;
    }
    public void run()
    {
        System.out.println("Rabbit no "+ nr + "is running");
    }
}
