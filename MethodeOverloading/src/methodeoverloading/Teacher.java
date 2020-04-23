
package methodeoverloading;

public class Teacher extends Person {
    String Qualification;
    @Override
    void displayinformation(){
          
        System.out.println("Teacher Name : "+name);
        System.out.println("Teacher Age : "+age);
        System.out.println("Teacher Qualification : "+Qualification);
    }
    
}
