package org.vinnivso.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.vinnivso.dao.interfaces.IMatriculaDAO;
import org.vinnivso.domain.Curso;
import org.vinnivso.domain.Matricula;

import java.util.List;

public class MatriculaDAO implements IMatriculaDAO {
    /**
     * This method is used to persist a Matricula object in the database.
     *
     * @param matricula The Matricula object to be persisted
     * @return The persisted Matricula object
     */
    @Override
    public Matricula cadastrar(Matricula matricula) {
        // Create an EntityManagerFactory using the persistence unit named "MODULE-32"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");

        // Create an EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin a transaction
        entityManager.getTransaction().begin();

        // Persist the Matricula object
        entityManager.persist(matricula);

        // Commit the transaction
        entityManager.getTransaction().commit();

        // Close the EntityManager
        entityManager.close();

        // Close the EntityManagerFactory
        entityManagerFactory.close();

        // Return the persisted Matricula object
        return matricula;
    }

    /**
     * Retrieves a list of all Matricula objects from the database.
     *
     * @return List of Matricula objects
     */
    @Override
    public List<Matricula> buscarTodos() {
        // Create entity manager factory and entity manager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Create criteria builder and query
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
        Root<Matricula> root = query.from(Matricula.class);
        query.select(root);

        // Execute query and retrieve list of Matricula objects
        TypedQuery<Matricula> tpQuery = entityManager.createQuery(query);
        List<Matricula> list = tpQuery.getResultList();

        // Close entity manager and entity manager factory
        entityManager.close();
        entityManagerFactory.close();

        return list;
    }

    /**
     * Searches for a Matricula by Curso.
     *
     * @param curso The Curso to search for.
     * @return The found Matricula.
     */
    @Override
    public Matricula buscarPorCurso(Curso curso) {
        // Create entity manager factory and entity manager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Build query string
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Matricula m ");
        sb.append("INNER JOIN Curso c on c = m.curso ");
        sb.append("WHERE c = :curso");

        // Begin transaction
        entityManager.getTransaction().begin();

        // Create and execute query
        TypedQuery<Matricula> query = entityManager.createQuery(sb.toString(), Matricula.class);
        query.setParameter("curso", curso);
        Matricula matricula = query.getSingleResult();

        // Close entity manager and entity manager factory
        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    /**
     * Retrieves a Matricula based on the given Curso using Criteria API.
     *
     * @param curso The Curso object to search for in Matricula records
     * @return The Matricula object associated with the given Curso
     */
    @Override
    public Matricula buscarPorCursoCriteria(Curso curso) {
        // Create entity manager factory and entity manager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Create CriteriaBuilder and CriteriaQuery for Matricula
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
        Root<Matricula> root = query.from(Matricula.class);

        // Create join between Matricula and Curso
        Join<Object, Object> join = root.join("curso", JoinType.INNER);
        query.select(root).where(builder.equal(join, curso));

        // Execute query and get single result
        TypedQuery<Matricula> tpQuery = entityManager.createQuery(query);
        Matricula matricula = tpQuery.getSingleResult();

        // Close entity manager and entity manager factory
        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    /**
     * Searches for a Matricula object by the code of the associated Curso.
     *
     * @param codigoCurso the code of the Curso to search by
     * @return the Matricula object found
     */
    @Override
    public Matricula buscarPorCodigoCurso(String codigoCurso) {
        // Create entity manager factory and entity manager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Build the JPQL query
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Matricula m ");
        sb.append("INNER JOIN Curso c on c = m.curso ");
        sb.append("WHERE c.codigo = :codigoCurso");

        // Begin transaction
        entityManager.getTransaction().begin();

        // Create and execute the query
        TypedQuery<Matricula> query = entityManager.createQuery(sb.toString(), Matricula.class);
        query.setParameter("codigoCurso", codigoCurso);
        Matricula matricula = query.getSingleResult();

        // Close entity manager and entity manager factory
        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    /**
     * Searches for a Matricula by the codigoCurso using Criteria API.
     *
     * @param codigoCurso the codigoCurso to search for
     * @return the Matricula found, or null if not found
     */
    @Override
    public Matricula buscarPorCodigoCursoCriteria(String codigoCurso) {
        // Create entity manager factory and entity manager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Create CriteriaBuilder
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        // Create CriteriaQuery for Matricula
        CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
        Root<Matricula> root = query.from(Matricula.class);

        // Join Matricula with Curso entity
        Join<Object, Object> join = root.join("curso", JoinType.INNER);

        // Define the where clause to search by codigoCurso
        query.select(root).where(builder.equal(join.get("codigo"), codigoCurso));

        // Execute the query and get the single result
        TypedQuery<Matricula> tpQuery = entityManager.createQuery(query);
        Matricula matricula = tpQuery.getSingleResult();

        // Close entity manager and entity manager factory
        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    /**
     * Deletes a matricula from the database.
     *
     * @param matricula the matricula to be deleted.
     */
    @Override
    public void excluir(Matricula matricula) {
        // Create an EntityManagerFactory and EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin a transaction
        entityManager.getTransaction().begin();

        // Merge the matricula into the persistence context
        matricula = entityManager.merge(matricula);

        // Remove the matricula from the persistence context
        entityManager.remove(matricula);

        // Commit the transaction
        entityManager.getTransaction().commit();

        // Close the EntityManager and EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();
    }
}

