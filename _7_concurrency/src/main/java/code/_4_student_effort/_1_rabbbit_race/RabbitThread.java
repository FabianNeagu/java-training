package code._4_student_effort._1_rabbbit_race;

import java.util.concurrent.RunnableFuture;

public class RabbitThread extends Thread
{
    private int nr;

    public RabbitThread(int nr)
    {
        this.nr=nr;
    }
    public void run()
    {
        System.out.println("Rabbit no. "+nr+" is running");
    }
}
