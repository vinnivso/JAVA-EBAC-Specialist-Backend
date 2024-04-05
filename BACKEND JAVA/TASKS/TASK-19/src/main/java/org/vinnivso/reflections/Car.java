package org.vinnivso.reflections;

public class Car {
    private String model;
    private String engineModel;
    private int enginePower;
    public Car(){}

    public String getModel() {
        return model;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
