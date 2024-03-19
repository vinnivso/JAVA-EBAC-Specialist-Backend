import org.junit.Assert;
import org.junit.Test;
import org.vinnivso.dao.ContractDAO;
import org.vinnivso.dao.IContractDAO;
import org.vinnivso.dao.mocks.ContractDAOMock;
import org.vinnivso.service.ContractService;
import org.vinnivso.service.IContractService;

public class ContractServiceTest {
    @Test
    public void test() {
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
