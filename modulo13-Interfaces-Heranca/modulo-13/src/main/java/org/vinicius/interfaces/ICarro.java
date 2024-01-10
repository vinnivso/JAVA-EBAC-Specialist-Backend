package org.vinicius.interfaces;

public interface ICarro {
    default void parar() {
        System.out.println("Carro parando!");
    }

    public void andar();
}
