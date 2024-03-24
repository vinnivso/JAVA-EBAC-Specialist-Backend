package org.vinnivso.dao.interfaces;

import org.vinnivso.domain.Curso;
import org.vinnivso.domain.Matricula;
import org.vinnivso.domain.Produto;

import java.util.List;

public interface IProdutoDAO {
    Produto cadastrar(Produto produto);
    Produto buscarPorCodCurso ( String codigoCurso);
    Produto buscarPorCurso (Curso curso);

    Produto buscarPorCodMatricula ( String codigoMatricula);
    Produto buscarPorMatricula (Matricula matricula);

    List<Produto> buscarTodos();
    void excluir(Produto produto);
}
