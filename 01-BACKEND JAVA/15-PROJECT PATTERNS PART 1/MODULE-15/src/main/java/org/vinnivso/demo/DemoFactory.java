package org.vinnivso.demo;

import org.vinnivso.factory.*;

public class DemoFactory {
    public static void main(String[] args) {
        Customer client = new Customer("A", false);
        Factory factory = getFactory(client);
        Car car = factory.create(client.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer client) {
        if (client.hasCompanyContract()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
