package code._4_student_effort._6_Builder;

public class Person
{
    private String nume;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;

    public Person(Builder builder)
    {
        nume=builder.nume;
        job=builder.job;
        university=builder.university;
        drivingLicense=builder.drivingLicense;
        isMarried=builder.isMarried;
    }
    public static class Builder
    {
        private final String nume;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public Builder(String name)
        {
            nume=name;
        }
        public void setJob(String j)
        {
            job=j;
        }
        public void setUniversity(String u)
        {
            university=u;
        }
        public void setDrivingLicense(String d)
        {
            drivingLicense=d;
        }
        public void setMarried(Boolean ok)
        {
            isMarried=ok;
        }
        public Person build()
        {
            return new Person(this);
        }
    }
}
