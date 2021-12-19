package code._4_student_effort._3_rock_paper_scissors;

public class Challenge
{
    public static void main(String[] args) throws Throwable
    {
        Player p1=new Player("Fabi","");
        Player p2=new Player("Andra", "");
        p1.start();
        p2.start();

        p1.join();
        p2.join();

        System.out.println("Extragereile au fost "+ p1.getExtragere() + " si "+ p2.getExtragere());
    }
}
