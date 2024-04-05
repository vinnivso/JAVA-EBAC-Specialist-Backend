package org.vinnivso.demo;

import org.vinnivso.observer.Jornalista;
import org.vinnivso.observer.TV;

public class DemoObserver {
    public static void main(String args[]) {
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Teste");
    }
}
