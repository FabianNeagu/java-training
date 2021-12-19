package code._4_student_effort._1_rabbbit_race;

public class Challenge {
    public static void main(String[] args)
    {
        run();
    }

    public static Thread createRunnable(int i) {
        return new Thread(new RabbitRunnable(i));
    }

    public static Thread createThread(int i) {
        return new Thread(new RabbitThread(i));
    }

    public static void startThread(Thread x) {
        x.start();
    }

    public static Thread selectWhich(int i) {
        if (i % 2 == 0)
            return createRunnable(i);
        else
            return createThread(i);
    }

    public static void run() {
        for (int i = 0; i < 10; i++) {
            Thread a = selectWhich(i);
            startThread(a);
        }
    }
}
