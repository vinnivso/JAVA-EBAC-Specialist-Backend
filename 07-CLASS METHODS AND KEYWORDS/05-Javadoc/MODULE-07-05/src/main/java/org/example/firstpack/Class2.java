package org.example.firstpack;

/**
 * @author VINNIVSO
 */
public class Class2 {
    private String privateProp;
    public String publicProp;
    String defaultProp;
    protected  String protectedProp;

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.getPrivateProp();
        //class1.defaultProp
    }
}
