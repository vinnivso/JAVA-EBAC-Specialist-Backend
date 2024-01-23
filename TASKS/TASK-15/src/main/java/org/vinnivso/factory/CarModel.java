package org.vinnivso.factory;

public abstract class CarModel {
    private String engineModel;
    private int enginePower;
    private String fuelType;
    private String color;

    public CarModel(String engineModel, int enginePower, String fuelType, String color) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("Engine has been started, and is ready to utilize " + enginePower + "HP");
    }
    public void clean(){
        System.out.println("Car has been cleaned, and the " + color.toLowerCase() + " color shines");
    }
    public void mechanicCheck(){
        System.out.println("Car has been checked and approved by the mechanic. Everything looks good!");
    }
    public void fuelCheck(){
        System.out.println("Car is being filled with " + fuelType.toLowerCase());
    }
}
