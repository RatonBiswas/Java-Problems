package javaprac;

public class Polymorphism1Main {

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        Polymorphism pc = new Polymorphism1(10.0, 20.0);
        Polymorphism pc1 = new Polymorphism2(20.5, 23.5);
        System.out.println(p.area());
        System.out.println(pc.area());
        System.out.println(pc1.area());
    }
}
