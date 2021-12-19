package code._4_student_effort._3_rock_paper_scissors;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player extends Thread
{
    private String nume;
    private String extragere;

    public Player(String nume,String extragere)
    {
        this.nume=nume;
        this.extragere=extragere;
    }
    public void run()
    {
        this.randomExtraction();
    }
    public void randomExtraction()
    {
        List<String> options= Arrays.asList("Piatra","Hartie","Foarfeca");
        extragere=options.get(new Random().nextInt(3));
    }
    public String getExtragere()
    {
        return extragere;
    }
}
