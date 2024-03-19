package org.vinnivso.service;

import org.vinnivso.dao.IContractDAO;

public class ContractService implements IContractService {
    private IContractDAO contractDAO;

    public ContractService(IContractDAO contractDAO) {
        this.contractDAO = contractDAO;
    }

    @Override
    public String salvar() {
        contractDAO.salvar();
        return "Sucesso em salvar Contract";
    }

    @Override
    public String buscar() {
        contractDAO.buscar();
        return "Sucesso em buscar Contract";
    }

    @Override
    public String alterar() {
        contractDAO.alterar();
        return "Sucesso em alterar Contract";
    }

    @Override
    public String excluir() {
        contractDAO.excluir();
        return "Sucesso em excluir Contract";
    }
}
