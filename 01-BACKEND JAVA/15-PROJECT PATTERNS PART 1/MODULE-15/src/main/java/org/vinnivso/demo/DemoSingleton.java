package org.vinnivso.demo;

import org.vinnivso.singleton.Singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        //Sempre está referenciando o mesmo objeto.
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
