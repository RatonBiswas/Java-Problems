package methodeoverloading;

public class MethodeOverloading2 {

    static int Adder(int a, int b) {
        return a + b;
    }

    static double Adder(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(MethodeOverloading2.Adder(11, 11));
        System.out.println(MethodeOverloading2.Adder(12.2, 15.9));
    }
}
