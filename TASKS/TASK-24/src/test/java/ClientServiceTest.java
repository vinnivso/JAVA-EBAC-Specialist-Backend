import org.junit.Assert;
import org.junit.Test;
import org.vinnivso.dao.ClientDAO;
import org.vinnivso.dao.IClientDAO;
import org.vinnivso.dao.mocks.ClientDAOMock;
import org.vinnivso.service.ClientService;

public class ClientServiceTest {
    @Test
    public void salvarTest () {
        IClientDAO dao = new ClientDAOMock();
        ClientService service = new ClientService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso em salvar Client", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest () {
        IClientDAO dao = new ClientDAO();
        ClientService service = new ClientService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso em salvar Client", retorno);
    }
    @Test
    public void buscarTest(){
        IClientDAO dao = new ClientDAOMock();
        ClientService service = new ClientService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso em buscar Client", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest(){
        IClientDAO DaoDao = new ClientDAO();
        ClientService service = new ClientService(DaoDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso em buscar Client", retorno);
    }
}
