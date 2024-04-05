package org.vinnivso.singleton;

public class SingletonPropertieSync {
    private static SingletonPropertieSync singleton;
    private String value;

    private SingletonPropertieSync(String value) {
        this.value = value;
    }

    public static synchronized SingletonPropertieSync getInstance(String value) {
        if (singleton == null) {
            singleton = new SingletonPropertieSync(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
