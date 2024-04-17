import Annotation.TipochaveExcep;
import Cliente.Dao.ClienteDao;
import Cliente.Dao.IClienteDao;
import Cliente.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {
    IClienteDao clienteDao;
    Cliente cliente;


    public ClienteDaoTest(){

        this.clienteDao = new ClienteDao();
    }

    @Before
    public void init() throws TipochaveExcep {
        cliente = new Cliente("André",1222221231l,99999999L,"Hilário");
        clienteDao.cadastrar(cliente);

    }

    @Test
    public void cadastrarCliente() throws TipochaveExcep{
        boolean retorno = clienteDao.cadastrar(new Cliente("André",1444441231l,99999999L,"Hilário"));
        Assert.assertTrue(retorno);
    }

    @Test
    public void pesquisarCliente(){
        Cliente retorno = clienteDao.consultar(cliente.getCpf());
        Assert.assertEquals(cliente.toString(), retorno.toString());
    }
    @Test
    public void alterarCliente() throws TipochaveExcep{
//        cliente.setNome("Andréas");
//        clienteDao.alterar(cliente);
        cliente.setNome("Andréas");
        clienteDao.alterar(cliente);
        Cliente retorno = clienteDao.consultar(cliente.getCpf());
        Assert.assertEquals("Andréas", retorno.getNome());

    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }
}
