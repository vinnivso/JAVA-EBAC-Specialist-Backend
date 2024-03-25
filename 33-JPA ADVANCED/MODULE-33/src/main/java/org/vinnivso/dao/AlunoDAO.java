package org.vinnivso.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.vinnivso.dao.interfaces.IAlunoDAO;
import org.vinnivso.domain.Aluno;

public class AlunoDAO implements IAlunoDAO {
    @Override
    public Aluno cadastrar(Aluno aluno) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(aluno);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


        return aluno;
    }
}
