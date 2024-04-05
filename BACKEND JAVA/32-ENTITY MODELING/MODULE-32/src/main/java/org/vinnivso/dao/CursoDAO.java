package org.vinnivso.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.vinnivso.dao.interfaces.ICursoDAO;
import org.vinnivso.domain.Curso;

import java.util.List;

public class CursoDAO implements ICursoDAO {
    /**
     * Registers a Curso object in the database.
     *
     * @param curso the Curso object to be registered
     * @return the registered Curso object
     */
    @Override
    public Curso cadastrar(Curso curso) {
        // Create entity manager factory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");

        // Create entity manager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin transaction
        entityManager.getTransaction().begin();

        // Persist the curso object
        entityManager.persist(curso);

        // Commit transaction
        entityManager.getTransaction().commit();

        // Close entity manager
        entityManager.close();

        // Close entity manager factory
        entityManagerFactory.close();

        return curso;
    }

    /**
     * Retrieve all courses from the database.
     *
     * @return List of all courses
     */
    @Override
    public List<Curso> buscarTodos() {
        // Create entity manager factory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        // Create entity manager
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // Begin transaction
        entityManager.getTransaction().begin();
        // Retrieve all courses using JPQL
        List<Curso> list = entityManager.createQuery("SELECT c FROM Curso c", Curso.class).getResultList();
        // Commit transaction
        entityManager.getTransaction().commit();
        // Close entity manager
        entityManager.close();
        // Close entity manager factory
        entityManagerFactory.close();
        // Return the list of courses
        return list;
    }

    /**
     * Finds a course by its ID.
     *
     * @param id The ID of the course to find.
     * @return The course found or null if not found.
     */
    @Override
    public Curso buscarPorID(Long id) {
        // Create entity manager factory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        // Create entity manager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin transaction
        entityManager.getTransaction().begin();
        // Find the course by ID
        Curso curso = entityManager.find(Curso.class, id);
        // Commit transaction
        entityManager.getTransaction().commit();

        // Close entity manager
        entityManager.close();
        // Close entity manager factory
        entityManagerFactory.close();

        return curso;
    }

    /**
     * Updates the given Curso object in the database.
     *
     * @param curso The Curso object to be updated
     * @return The updated Curso object
     */
    @Override
    public Curso alterar(Curso curso) {
        // Create an EntityManagerFactory using the "MODULE-32" persistence unit
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");

        // Create an EntityManager from the factory
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin a transaction
        entityManager.getTransaction().begin();

        // Merge the provided Curso object with the database
        curso = entityManager.merge(curso);

        // Commit the transaction
        entityManager.getTransaction().commit();

        // Close the EntityManager
        entityManager.close();

        // Close the EntityManagerFactory
        entityManagerFactory.close();

        // Return the updated Curso object
        return curso;
    }

    /**
     * Deletes the given course from the database.
     *
     * @param curso The course to be deleted
     */
    @Override
    public void excluir(Curso curso) {
        // Create an EntityManagerFactory using the persistence unit "MODULE-32"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");

        // Create an EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin a transaction
        entityManager.getTransaction().begin();

        // Merge the provided course with the database to ensure it's in the managed state
        curso = entityManager.merge(curso);

        // Remove the course from the database
        entityManager.remove(curso);

        // Commit the transaction
        entityManager.getTransaction().commit();

        // Close the EntityManager
        entityManager.close();

        // Close the EntityManagerFactory
        entityManagerFactory.close();
    }
}
