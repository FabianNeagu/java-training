package code._4_student_effort._2_incercare;

public class Array {
    public static void main(String[] args) {
        try {
            int[] v = new int[]{1, 2, 3};
            citireArray(v);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void citireArray(int[] v) throws ArrayIndexOutOfBoundsException {
        try {
            System.out.println(v[v.length + 1]);
        } finally {
            System.out.println("degeaba");
        }
    }
}
