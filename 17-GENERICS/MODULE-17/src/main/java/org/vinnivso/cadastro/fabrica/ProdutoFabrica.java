package org.vinnivso.cadastro.fabrica;

import org.vinnivso.cadastro.domain.Persistente;
import org.vinnivso.cadastro.domain.Produto;

public class ProdutoFabrica implements FabricaPersistente {
    @Override
    public Persistente criarObjeto(String[] dados) {
        Produto produto = new Produto();
        produto.setCodigo(Long.parseLong(dados[0].trim()));
        produto.setNome(dados[1]);
        return produto;
    }
}
