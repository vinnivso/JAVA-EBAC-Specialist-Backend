package org.vinicius.interfaces;

public class Caminhao implements ICarro {

    @Override
    public void andar() {
        System.out.println("Caminhao em movimento!");
    }

    @Override
    public void parar() {
        System.out.println("Caminhao parando!");
    }
}
