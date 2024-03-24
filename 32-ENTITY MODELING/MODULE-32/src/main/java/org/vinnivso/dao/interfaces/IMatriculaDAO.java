package org.vinnivso.dao.interfaces;

import org.vinnivso.domain.Curso;
import org.vinnivso.domain.Matricula;

import java.util.List;

public interface IMatriculaDAO {
    Matricula cadastrar(Matricula matricula);

    List<Matricula> buscarTodos();

    Matricula buscarPorCurso(Curso curso);

    Matricula buscarPorCursoCriteria(Curso curso);

    Matricula buscarPorCodigoCurso(String codigoCurso);

    Matricula buscarPorCodigoCursoCriteria(String codigoCurso);

    void excluir(Matricula matricula);
}
