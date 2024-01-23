package org.vinnivso.factory;

public abstract class Factory {
    public CarModel createCar(String request) {
        CarModel carModel = retrieveCar(request);
        carModel = prepareCar(carModel);
        return carModel;
    }

    abstract CarModel retrieveCar(String request);

    private CarModel prepareCar(CarModel carModel) {
        carModel.clean();
        carModel.mechanicCheck();
        carModel.fuelCheck();
        return carModel;
    }
}
