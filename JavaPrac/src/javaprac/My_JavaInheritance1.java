package javaprac;

class JavaInheritance1 {

    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The addition of the given number :" + z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("the Subtraction of the given number :" + z);
    }
}

class My_JavaInheritance1 extends JavaInheritance1 {

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The multiplication of the given number :" + z);
    }

}

class By_JavaInheritance1 extends My_JavaInheritance1 {

    public void Divition(int x, int y) {
        z = x / y;
        System.out.println("The divition of the given number :" + z);
    }

    public static void main(String[] args) {
        int a = 20, b = 5;
        By_JavaInheritance1 m = new By_JavaInheritance1();
        m.addition(a, b);
        m.Subtraction(a, b);
        m.multiplication(a, b);
        m.Divition(a, b);
    }

}
