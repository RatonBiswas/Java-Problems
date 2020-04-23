package com.Raton;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean toManual;
    private int currentGears;

    public Car(String name, String size, int wheels, int doors, int gears, boolean toManual, int currentGears) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.toManual = toManual;
        this.currentGears = 1;
    }

    public void changeGears(int currentGears) {
        this.currentGears = currentGears;
        System.out.println("Car.setCurrentGears(): Change to "+this.currentGears+" gear");
    }
    public void changeVelocity(int speed,int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity "+speed+"derection "+direction);
    }

}
