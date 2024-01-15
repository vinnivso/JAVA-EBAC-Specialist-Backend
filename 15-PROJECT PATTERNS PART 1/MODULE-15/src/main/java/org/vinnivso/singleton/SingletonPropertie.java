package org.vinnivso.singleton;

public class SingletonPropertie {
    private static SingletonPropertie singleton;
    private String value;

    private SingletonPropertie(String value) {
        this.value = value;
    }

    public static SingletonPropertie getInstance(String value) {
        if (singleton == null) {
            singleton = new SingletonPropertie(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
