package org.vinnivso.dao.interfaces;

import org.vinnivso.domain.Curso;
import org.vinnivso.domain.Matricula;

public interface IMatriculaDAO {
    Matricula cadastrar(Matricula mat);

    Matricula buscarPorCodigoCurso(String codigoCurso);

    Matricula buscarPorCurso(Curso curso);

    Matricula buscarPorCodigoCursoCriteria(String codigoCurso);

    Matricula buscarPorCursoCriteria(Curso curso);
}
