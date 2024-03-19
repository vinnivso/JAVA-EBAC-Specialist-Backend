package org.vinnivso;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {
    @Test
    public void testEquals(){
        String name = "Vinícius";
        Assert.assertEquals("Vinícius", name);
    }

    @Test
    public void testNotEquals(){
        String name = "Vinícius";
        Assert.assertNotEquals("Godwyn", name);
    }
}
