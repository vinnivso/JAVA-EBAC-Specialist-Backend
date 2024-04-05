package org.vinnivso.dao;

public class ClientDAO implements IClientDAO{
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem configuração de banco SALVAR");
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException("Não funciona sem configuração de banco BUSCAR");
    }
}
