package methodeoverloading;

public class OverriddingTest {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Raton Biswas ";
        t1.age = 19;
        t1.Qualification = "Bsc in Swe";
        t1.displayinformation();
        Person p1 = new Person();
        p1.name = "Lakshman Gope ";
        p1.age = 20;
        p1.displayinformation();
    }

}
