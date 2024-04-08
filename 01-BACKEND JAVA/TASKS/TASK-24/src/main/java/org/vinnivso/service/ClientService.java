package org.vinnivso.service;

import org.vinnivso.dao.ClientDAO;
import org.vinnivso.dao.IClientDAO;

public class ClientService {
    private IClientDAO clientDAO;

    public ClientService(IClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }


    public String salvar() {
        clientDAO.salvar();
        return "Sucesso em salvar Client";
    }

    public String buscar() {
        clientDAO.buscar();
        return "Sucesso em buscar Client";
    }
}