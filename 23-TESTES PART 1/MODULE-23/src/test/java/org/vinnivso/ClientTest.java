package org.vinnivso;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
    @Test
    public void testClientModel(){
        ClientModel client = new ClientModel();
        client.addingName("Vinni");

        Assert.assertEquals("Vinni", client.getName());
    }
}
