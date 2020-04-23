package com.Raton;

public class Car {
    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String colour;



    public void setModel(String model){
        String validmodel= model.toLowerCase();
        if(validmodel.equals("lifafo")||validmodel.equals("Decosta")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
