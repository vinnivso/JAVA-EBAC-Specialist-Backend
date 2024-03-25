package dao;

import dao.interfaces.IMarcaDAO;
import domain.Marca;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MarcaDAO implements IMarcaDAO {
    /**
     * This method is used to persist a new 'Marca' entity to the database.
     *
     * @param marca The 'Marca' entity to be persisted
     * @return The persisted 'Marca' entity
     */
    @Override
    public Marca cadastrar(Marca marca) {
        // Create EntityManagerFactory using the persistence unit name "TASK-33"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TASK-33");
        // Create EntityManager from EntityManagerFactory
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin a new transaction
        entityManager.getTransaction().begin();
        // Persist the 'Marca' entity
        entityManager.persist(marca);
        // Commit the transaction
        entityManager.getTransaction().commit();

        // Close EntityManager
        entityManager.close();
        // Close EntityManagerFactory
        entityManagerFactory.close();

        // Return the persisted 'Marca' entity
        return marca;
    }
}
