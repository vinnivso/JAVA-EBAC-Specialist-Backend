package org.vinnivso.services;

import org.vinnivso.dao.IClienteDAO;
import org.vinnivso.domain.Cliente;
import org.vinnivso.exceptions.DAOException;
import org.vinnivso.exceptions.TipoChaveNaoEncontradaException;
import org.vinnivso.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        return this.dao.consultar(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cliente);
    }

}
