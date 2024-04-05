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
        return "Sucesso";
    }
}
