package org.vinnivso.singleton;

//NÃO HAVERÁ INSTANCIAÇÃO DESSA CLASSE EM OUTRO LOCAL DO CÓDIGO. INSTANCIANDO SOMENTE UMA ÚNICA VEZ
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
