package org.example.secondpack;

import org.example.firstpack.Class2;

public class Class3 extends Class2 {
    public static void main(String[] args) {
        //Extends the CLASS2 in CLASS2, I can access all attributes from CLASS2, except DEFAULT ATTRIBUTE
        Class2 class2 = new Class2();
        //Cannot Access DEFAULT PROPERTIE from CLASS2, because CLASS3 package !== CLASS2 package
    }
}
