package org.vinnivso.dao.interfaces;

import org.vinnivso.domain.Curso;

import java.util.List;

public interface ICursoDAO {
    public Curso cadastrar(Curso curso);

    public List<Curso> buscarTodos();

    public Curso buscarPorID(Long id);

    public Curso alterar(Curso curso);

    public void excluir(Curso curso);
}
