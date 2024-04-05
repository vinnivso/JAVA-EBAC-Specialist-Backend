package org.vinnivso.dao;

import org.vinnivso.dao.generic.IGenericDAO;
import org.vinnivso.domain.Venda;
import org.vinnivso.exceptions.DAOException;
import org.vinnivso.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}

