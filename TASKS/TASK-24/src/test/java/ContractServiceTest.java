import org.junit.Assert;
import org.junit.Test;
import org.vinnivso.dao.ContractDAO;
import org.vinnivso.dao.IContractDAO;
import org.vinnivso.dao.mocks.ContractDAOMock;
import org.vinnivso.service.ContractService;
import org.vinnivso.service.IContractService;

public class ContractServiceTest {
    @Test
    public void salvarTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso em salvar Contract", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvar(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso em salvar Contract", retorno);
    }

    @Test
    public void buscarTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso em buscar Contract", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        IContractDAO dao = new ContractDAO();
        ContractService service = new ContractService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso em buscar Contract", retorno);
    }

    @Test
    public void alterarTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String retorno = service.alterar();
        Assert.assertEquals("Sucesso em alterar Contract", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAlterarTest() {
        IContractDAO dao = new ContractDAO();
        ContractService service = new ContractService(dao);
        String retorno = service.alterar();
        Assert.assertEquals("Sucesso em alterar Contract", retorno);
    }

    @Test
    public void excluirTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso em excluir Contract", retorno);
    }


    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        IContractDAO dao = new ContractDAO();
        ContractService service = new ContractService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso em excluir Contract", retorno);
    }
}
