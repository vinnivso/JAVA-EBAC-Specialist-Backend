package org.vinnivso;

import org.vinnivso.factory.*;

public class Main {
    public static void main(String[] args) {
        Customer firstClient = new Customer("Toyota", true);
        Factory firstFactory = getFactory(firstClient);
        CarModel firstCarModel = firstFactory.createCar(firstClient.getRequest());
        firstCarModel.startEngine();

        Customer secondClient = new Customer("Nissan", true);
        Factory secondFactory = getFactory(secondClient);
        CarModel secondCarModel = secondFactory.createCar(secondClient.getRequest());
        secondCarModel.startEngine();

        Customer thirdClient = new Customer("Fiat", false);
        Factory thirdFactory = getFactory(thirdClient);
        CarModel thirdCarModel = thirdFactory.createCar(thirdClient.getRequest());
        thirdCarModel.startEngine();

    }

    private static Factory getFactory(Customer client) {
        if (client.getCompanyContract()) {
            return new ContractFactory();
        } else {
            return new NoContractFactory();
        }
    }
}