package com.Raton;

public class BMW extends Car {
    private int roadServiceMonths;

    public BMW(int roadServiceMonths) {
        super("Bmw","4wd", 5, 5, 6,true,1);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity =getCurrentVelocity()+rate;
        if(newVelocity==0){
            stop();
        }else if(newVelocity>0&&newVelocity<=10){
            changeGears(1);
        }else if(newVelocity>10 && newVelocity<=20){
            changeGears(2);
        }else if(newVelocity>20 && newVelocity<=30){
            changeGears(4);
        }else{
            changeGears(5);
        }
        if(newVelocity>0){
            changeVelocity(newVelocity,getCurrentVelocity());
        }
    }

}
