
package javaprac;

public class Polymorphism1 extends Polymorphism {
    double length,width;
    Polymorphism1(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    @Override
    double area()
    {
        return length*width;
    }
    
}
