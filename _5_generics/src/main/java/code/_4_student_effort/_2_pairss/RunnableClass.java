package code._4_student_effort._2_pairss;

public class RunnableClass
{
    public static void main(String[] args) {
        Running runningShoe1 = new Running(41, "RED");
        Running runningShoe2 = new Running(41, "RED");
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

        Boot bootShoe = new Boot(45, "BLACK");
        //Pair<Running> pairNotOK = new Pair<>(runningShoe1, bootShoe);


        Running runningShoe3 = new Running(41, "RED");
        Running runningShoe4 = new Running(42, "RED");
        Pair<Running> pair1 = new Pair<>(runningShoe3, runningShoe4);

    }
}
