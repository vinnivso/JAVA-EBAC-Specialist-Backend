package org.vinicius.interfaces;

public class CarroPasseio implements ICarro {
    @Override
    public void andar() {
        System.out.println("Carro em movimento!");
    }
}
