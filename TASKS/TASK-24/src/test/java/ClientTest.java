import org.junit.Assert;
import org.junit.Test;
import org.vinnivso.TestClient;

public class ClientTest {
    @Test
    public void test() {
        TestClient client = new TestClient();
        client.adicionarNome("Radagon");
        client.adicionarNome1("Radagon");

        Assert.assertEquals("Radagon", client.getNome());
    }
}
