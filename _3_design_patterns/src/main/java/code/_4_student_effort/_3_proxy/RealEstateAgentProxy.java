package code._4_student_effort._3_proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] appartments = new Apartment[0];

    public void represent(Apartment apartament) {
        this.appartments = Arrays.copyOf(this.appartments, this.appartments.length + 1);
        this.appartments[this.appartments.length - 1] = apartament;
    }

    public Apartment rent(Student student) {
        Apartment rentedAppartment = null;
        if (!(student.getName().startsWith("P"))) {
            for (int i = 0; i < appartments.length; i++) {
                if (this.appartments[i].getMonthlyRentCost() < student.getMoney()) {
                    rentedAppartment = appartments[i];
                    int removeIndex = i;
                }
            }
        }
        return rentedAppartment;
    }
}
