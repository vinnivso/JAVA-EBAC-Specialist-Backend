import org.junit.Assert;
import org.junit.Test;
import org.vinnivso.dao.ClientDAO;
import org.vinnivso.dao.IClientDAO;
import org.vinnivso.dao.mocks.ClientDAOMock;
import org.vinnivso.service.ClientService;

public class ClientServiceTest {
    @Test
    public void test() {
        IClientDAO mockDao = new ClientDAOMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClientDAO mockDao = new ClientDAO();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
