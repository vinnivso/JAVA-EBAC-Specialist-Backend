package org.vinnivso.services;

import org.vinnivso.domain.Cliente;
import org.vinnivso.exceptions.DAOException;
import org.vinnivso.exceptions.TipoChaveNaoEncontradaException;
import org.vinnivso.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf) throws DAOException;

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}