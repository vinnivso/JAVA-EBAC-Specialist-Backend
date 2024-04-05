package org.vinnivso.demo;

import org.vinnivso.builder.Burger;
import org.vinnivso.builder.BurgerRestaurantDirector;
import org.vinnivso.builder.CheeseBurgerBuilder;
import org.vinnivso.builder.VeganBurgerBuilder;

public class DemoBurgerBuilder {
    public static void main(String[] args) {
        //ALTERNATIVA ao invés de utilizarmos os sets.
        //BurgerRestaurantDirector burgerRestaurant = new BurgerRestaurantDirector(new CheeseBurgerBuilder());
        BurgerRestaurantDirector burgerRestaurant = new BurgerRestaurantDirector();
        burgerRestaurant.setBuilder(new CheeseBurgerBuilder());
        buildBurger(burgerRestaurant);

        burgerRestaurant.setBuilder(new VeganBurgerBuilder());
        buildBurger(burgerRestaurant);
    }

    private static void buildBurger(BurgerRestaurantDirector burgerRestaurant) {
        Burger burger = burgerRestaurant.buildBurger();
        burger.print();
    }
}
