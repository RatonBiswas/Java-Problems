package com.Raton;

public class Bike {
    private String color;
    private String maxSpeed;

    public String getColor()  {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void Bikeinfo(){
        System.out.println("bike Information :");
        System.out.println("Color : "+this.color);
        System.out.println("Max Speed :"+this.maxSpeed);
    }
}
