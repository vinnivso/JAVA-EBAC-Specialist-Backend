package org.vinnivso.factory;

public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new BrasiliaCar(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
