package code._4_student_effort._6_Builder;

public class Example
{
    public static void main(String[] args)
    {
        Person person01 = new Person.Builder("Popescu")
                .setJob("java developer")
                .setUniversity("FMI")
                .setMarried(false)
                .build();

    }
}
