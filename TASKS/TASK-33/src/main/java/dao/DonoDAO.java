package dao;

import dao.interfaces.IDonoDAO;
import domain.Dono;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DonoDAO implements IDonoDAO {
    /**
     * Registers a new owner in the database.
     *
     * @param dono The owner object to be registered
     * @return The registered owner object
     */
    @Override
    public Dono cadastrar(Dono dono) {
        // Create an EntityManagerFactory instance
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        // Create an EntityManager instance
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin a transaction
        entityManager.getTransaction().begin();
        // Persist the owner object
        entityManager.persist(dono);
        // Commit the transaction
        entityManager.getTransaction().commit();

        // Close the EntityManager
        entityManager.close();
        // Close the EntityManagerFactory
        entityManagerFactory.close();

        // Return the registered owner object
        return dono;
    }
}
