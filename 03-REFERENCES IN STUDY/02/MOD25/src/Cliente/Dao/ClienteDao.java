package Cliente.Dao;

import Cliente.Cliente;
import Generic.GenericDAO;
public class ClienteDao extends GenericDAO<Cliente, Long> implements IClienteDao {

    public ClienteDao(){
        super();
    }

    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setTel(entityCadastrado.getTel());
    }
}
