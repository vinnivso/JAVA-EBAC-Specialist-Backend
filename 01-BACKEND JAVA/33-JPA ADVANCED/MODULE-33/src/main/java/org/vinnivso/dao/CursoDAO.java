package org.vinnivso.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.vinnivso.dao.interfaces.ICursoDAO;
import org.vinnivso.domain.Curso;

public class CursoDAO implements ICursoDAO {
    @Override
    public Curso cadastrar(Curso curso) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(curso);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return curso;
    }
}
