
package javaprac;


public class Polymorphism2 extends Polymorphism{
    double base,height;
     Polymorphism2(double base,double height)
    {
        this.base=base;
        this.height=height;
    }
    @Override
    double area(){
        return 0.5*base*height;
    }
    
}
