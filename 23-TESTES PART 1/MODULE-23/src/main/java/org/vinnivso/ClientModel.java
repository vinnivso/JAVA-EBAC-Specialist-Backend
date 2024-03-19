package org.vinnivso;

public class ClientModel {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addingName(String name) {
        setName(name);
    }
}