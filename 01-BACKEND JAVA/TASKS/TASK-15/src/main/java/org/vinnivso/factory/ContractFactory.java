package org.vinnivso.factory;

public class ContractFactory extends Factory{
    @Override
    CarModel retrieveCar(String request) {
        if ("Toyota".equalsIgnoreCase(request)) {
            return new ToyotaSupra("2JZGTE", 325, "Gasoline", "Black");
        } else if ("Nissan".equalsIgnoreCase(request)) {
            return new NissanGTR("RB26DETT", 276, "Gasoline", "Silver");
        }
        else {
            return null;
        }
    }
}
