package org.vinnivso.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.vinnivso.dao.interfaces.IMatriculaDAO;
import org.vinnivso.domain.Curso;
import org.vinnivso.domain.Matricula;

public class MatriculaDAO implements IMatriculaDAO {
    @Override
    public Matricula cadastrar(Matricula mat) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(mat);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return mat;
    }

    @Override
    public Matricula buscarPorCodigoCurso(String codigoCurso) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Matricula m ");
        sb.append("INNER JOIN Curso c on c = m.curso ");
        sb.append("WHERE c.codigo = :codigoCurso");

        entityManager.getTransaction().begin();
        TypedQuery<Matricula> query = entityManager.createQuery(sb.toString(), Matricula.class);
        query.setParameter("codigoCurso", codigoCurso);
        Matricula matricula = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    @Override
    public Matricula buscarPorCurso(Curso curso) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Matricula m ");
        sb.append("INNER JOIN Curso c on c = m.curso ");
        sb.append("WHERE c = :curso");

        entityManager.getTransaction().begin();
        TypedQuery<Matricula> query = entityManager.createQuery(sb.toString(), Matricula.class);
        query.setParameter("curso", curso);
        Matricula matricula = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    @Override
    public Matricula buscarPorCodigoCursoCriteria(String codigoCurso) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
        Root<Matricula> root = query.from(Matricula.class);
        Join<Object, Object> join = root.join("curso", JoinType.INNER);
        query.select(root).where(builder.equal(join.get("codigo"), codigoCurso));

        TypedQuery<Matricula> tpQuery = entityManager.createQuery(query);
        Matricula matricula = tpQuery.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    @Override
    public Matricula buscarPorCursoCriteria(Curso curso) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
        Root<Matricula> root = query.from(Matricula.class);
        Join<Object, Object> join = root.join("curso", JoinType.INNER);
        query.select(root).where(builder.equal(join, curso));

        TypedQuery<Matricula> tpQuery = entityManager.createQuery(query);
        Matricula matricula = tpQuery.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }
}
