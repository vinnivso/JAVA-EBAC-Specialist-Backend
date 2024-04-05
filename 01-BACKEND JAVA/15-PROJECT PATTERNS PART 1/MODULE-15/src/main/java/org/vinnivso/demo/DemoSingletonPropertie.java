package org.vinnivso.demo;


import org.vinnivso.singleton.SingletonPropertie;

public class DemoSingletonPropertie {
    public static void main(String[] args) {
        SingletonPropertie singleton = SingletonPropertie.getInstance("1st Test");
        SingletonPropertie singleton1 = SingletonPropertie.getInstance("2nd Test");

        //Sempre está referenciando o mesmo objeto.
        //Repare que o objeto que deveria imprimir com o valor "Second Test" nunca aparece.
        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());
    }
}
