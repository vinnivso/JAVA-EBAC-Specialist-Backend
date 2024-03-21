package org.vinnivso.services;

import org.vinnivso.dao.IProdutoDAO;
import org.vinnivso.domain.Produto;
import org.vinnivso.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
