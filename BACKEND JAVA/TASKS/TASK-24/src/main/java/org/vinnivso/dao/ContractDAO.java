package org.vinnivso.dao;

public class ContractDAO implements IContractDAO {
    @Override
    public void salvar() {
        throw new  UnsupportedOperationException("Não funciona com o banco SALVAR");
    }

    @Override
    public void buscar() {
        throw new  UnsupportedOperationException("Não funciona com o banco BUSCAR");

    }

    @Override
    public void alterar() {
        throw new  UnsupportedOperationException("Não funciona com o banco ALTERAR");

    }

    @Override
    public void excluir() {
        throw new  UnsupportedOperationException("Não funciona com o banco EXCLUIR");
    }
}
