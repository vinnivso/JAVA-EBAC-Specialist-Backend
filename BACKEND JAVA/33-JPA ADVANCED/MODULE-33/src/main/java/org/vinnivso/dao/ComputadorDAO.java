package org.vinnivso.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.vinnivso.dao.interfaces.IComputadorDAO;
import org.vinnivso.domain.Computador;

public class ComputadorDAO implements IComputadorDAO {
    @Override
    public Computador cadastrar(Computador computador) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(computador);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return computador;
    }
}
