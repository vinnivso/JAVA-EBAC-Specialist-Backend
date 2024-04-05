package org.vinnivso.domain;

import anotacao.ColunaTabela;
import anotacao.Tabela;
import org.vinnivso.dao.ProdutoDAO;

import java.math.BigDecimal;

@Tabela("TB_PRODUTO_QUANTIDADE")
public class ProdutoVenda extends Produto {

    @ColunaTabela(dbName = "id", setJavaName = "setId")
    private Long id;

    //@ColunaTabela(dbName = "id", setJavaName = "setId")
    private Produto produto;

    @ColunaTabela(dbName = "quantidade", setJavaName = "setQuantidade")
    private Integer quantidade;

    @ColunaTabela(dbName = "valor_total", setJavaName = "setValorTotal")
    private BigDecimal valorTotal;

    public ProdutoVenda() {
        this.quantidade = 0;
        this.valorTotal = BigDecimal.ZERO;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void adicionar(Integer quantidade, Integer estoque) {
        if( quantidade < estoque){
            this.quantidade += quantidade;
            BigDecimal novoValor = this.produto.getValor().multiply(BigDecimal.valueOf(quantidade));
            BigDecimal novoTotal = this.valorTotal.add(novoValor);
            this.valorTotal = novoTotal;
            this.produto.setEstoque(estoque - quantidade);
            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.alterar(this.produto);

        } else {
            System.out.println("IMPOSSÍVEL REALIZAR VENDA - ESTOQUE INSUFICIENTE");
//			throw new UnsupportedOperationException("IMPOSSÍVEL REALIZAR VENDA - ESTOQUE INSUFICIENTE");
        }

    }

    public void remover(Integer quantidade) {
        this.quantidade -= quantidade;
        BigDecimal novoValor = this.produto.getValor().multiply(BigDecimal.valueOf(quantidade));
        this.valorTotal = this.valorTotal.subtract(novoValor);
    }
}

