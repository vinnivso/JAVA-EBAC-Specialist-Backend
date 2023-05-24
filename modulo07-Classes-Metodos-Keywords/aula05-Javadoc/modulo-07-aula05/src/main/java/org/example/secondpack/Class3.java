package org.example.secondpack;

import org.example.Client;
import org.example.ItemSale;
import org.example.firstpack.Class1;
import org.example.firstpack.Class2;

/**
 * @author VINNIVSO
 */
public class Class3 extends Class2 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Client client = new Client();
        client.returnCLientName();

        ItemSale item = new ItemSale();
        //Extends the CLASS2 in CLASS2, I can access all attributes from CLASS2, except DEFAULT ATTRIBUTE
        Class2 class2 = new Class2();
        //Cannot Access DEFAULT PROPERTIE from CLASS2, because CLASS3 package !== CLASS2 package

    }
    /**
     * @deprecated
     */
    public void test() {

    }
}
