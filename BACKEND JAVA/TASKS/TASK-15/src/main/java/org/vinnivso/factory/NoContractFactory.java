package org.vinnivso.factory;

public class NoContractFactory extends Factory {
    @Override
    CarModel retrieveCar(String request) {
        if ("Fiat".equalsIgnoreCase(request)) {
            return new FiatUno("Fire 1.0", 56, "Flex", "Red");
        } else {
            return null;
        }
    }
}
