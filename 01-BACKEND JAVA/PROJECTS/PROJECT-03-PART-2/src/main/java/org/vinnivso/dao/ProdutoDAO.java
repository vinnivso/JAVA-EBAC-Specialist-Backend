package org.vinnivso.dao;

import org.vinnivso.dao.generic.GenericDAO;
import org.vinnivso.domain.Produto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setDescricao(entity.getDescricao());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setValor(entity.getValor());
        entityCadastrado.setPacote(entity.getPacote());
        entityCadastrado.setEstoque(entity.getEstoque());


    }

    @Override
    protected String getQueryInsercao() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_PRODUTO ");
        sb.append("(ID, CODIGO, NOME, DESCRICAO, VALOR, PACOTE, ESTOQUE)");
        sb.append("VALUES (nextval('sq_produto'),?,?,?,?,?,?)");
        return sb.toString();
    }

    @Override
    protected void setParametrosQueryInsercao(PreparedStatement stmInsert, Produto entity) throws SQLException {
        stmInsert.setString(1, entity.getCodigo());
        stmInsert.setString(2, entity.getNome());
        stmInsert.setString(3, entity.getDescricao());
        stmInsert.setBigDecimal(4, entity.getValor());
        //	TAREFA MOD30 -------------------------------------------
        stmInsert.setString(5, entity.getPacote());
        stmInsert.setInt(6, entity.getEstoque());


    }

    @Override
    protected String getQueryExclusao() {
        return "DELETE FROM TB_PRODUTO WHERE CODIGO = ?";
    }

    @Override
    protected void setParametrosQueryExclusao(PreparedStatement stmExclusao, String valor) throws SQLException {
        stmExclusao.setString(1, valor);
    }

    @Override
    protected String getQueryAtualizacao() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_PRODUTO ");
        sb.append("SET CODIGO = ?,");
        sb.append("NOME = ?,");
        sb.append("DESCRICAO = ?,");
        sb.append("VALOR = ?,");
        sb.append("PACOTE = ?,");
        sb.append("ESTOQUE = ?");


        sb.append(" WHERE CODIGO = ?");
        return sb.toString();
    }

    @Override
    protected void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Produto entity) throws SQLException {
        stmUpdate.setString(1, entity.getCodigo());
        stmUpdate.setString(2, entity.getNome());
        stmUpdate.setString(3, entity.getDescricao());
        stmUpdate.setBigDecimal(4, entity.getValor());
        stmUpdate.setString(5, entity.getPacote());
        stmUpdate.setInt(6, entity.getEstoque());

        stmUpdate.setString(7, entity.getCodigo());
    }

    @Override
    protected void setParametrosQuerySelect(PreparedStatement stmExclusao, String valor) throws SQLException {
        stmExclusao.setString(1, valor);
    }

}
