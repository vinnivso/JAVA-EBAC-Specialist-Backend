package org.vinicius.interfaces;

public interface ICaneta {
    public void escrever(String texto);
    public String getCor();

    //Partindo do JAVA 8, foi estabelecido a criação de métodos comuns seguindo a forma abaixo
    default void escreverComumATodas() {
        System.out.println("Escrita igual a todas!");
    }
}
