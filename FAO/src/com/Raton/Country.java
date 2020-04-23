package com.Raton;

public class Country {
    private String countryID;
    private String countryName;
    private double totalFoodProduced;

    public Country(String countryID, String countryName, double totalFoodProduced) {
        this.countryID = countryID;
        this.countryName = countryName;
        this.totalFoodProduced = totalFoodProduced;
    }
    public void totalFoodProduction(){
        if(totalFoodProduced>=50&&totalFoodProduced<=500)
        {
            System.out.println("This "+this.countryName+"does not need any support from the FAO.");
        }
        else
        {
            System.out.println("This "+this.countryName+"need Support from the FAO");
        }
    }
}
