package org.vinnivso.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.vinnivso.dao.interfaces.IProdutoDAO;
import org.vinnivso.domain.Curso;
import org.vinnivso.domain.Matricula;
import org.vinnivso.domain.Produto;

import java.util.List;

public class ProdutoDAO implements IProdutoDAO {
    /**
     * Cadastro de um produto.
     *
     * @param produto - O produto a ser cadastrado
     * @return O produto cadastrado
     */
    @Override
    public Produto cadastrar(Produto produto) {
        // Cria uma factory de gerenciador de entidades com o nome "MODULE-32"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        // Cria um gerenciador de entidades a partir da factory criada
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Inicia uma transação
        entityManager.getTransaction().begin();
        // Persiste o produto no banco de dados
        entityManager.persist(produto);
        // Finaliza a transação
        entityManager.getTransaction().commit();

        // Fecha o gerenciador de entidades
        entityManager.close();
        // Fecha a factory de gerenciador de entidades
        entityManagerFactory.close();
        // Retorna o produto cadastrado
        return produto;
    }

    /**
     * This method retrieves a 'Produto' entity by the 'codigoCurso'.
     *
     * @param codigoCurso The code of the course to search for
     * @return The 'Produto' entity associated with the provided 'codigoCurso'
     */
    @Override
    public Produto buscarPorCodCurso(String codigoCurso) {
        // Create entity manager factory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        // Create entity manager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Build query string
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT p FROM Produto p ");
        sb.append("INNER JOIN Curso c on c = p.curso ");
        sb.append("WHERE c.codigo = :codigoCurso");

        // Begin transaction
        entityManager.getTransaction().begin();
        // Create query and set parameter
        TypedQuery<Produto> query = entityManager.createQuery(sb.toString(), Produto.class);
        query.setParameter("codigoCurso", codigoCurso);
        // Retrieve single result
        Produto produto = query.getSingleResult();

        // Close entity manager
        entityManager.close();
        // Close entity manager factory
        entityManagerFactory.close();

        return produto;
    }

    /**
     * Retrieves a product by the associated course.
     *
     * @param curso The course to search for
     * @return The product associated with the given course
     */
    @Override
    public Produto buscarPorCurso(Curso curso) {
        // Create entity manager factory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");

        // Create entity manager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Build query
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT p FROM Produto p ");
        sb.append("INNER JOIN Curso c on c = p.curso ");
        sb.append("WHERE c = :curso");

        // Begin transaction
        entityManager.getTransaction().begin();

        // Create and execute query
        TypedQuery<Produto> query = entityManager.createQuery(sb.toString(), Produto.class);
        query.setParameter("curso", curso);
        Produto produto = query.getSingleResult();

        // Close entity manager and entity manager factory
        entityManager.close();
        entityManagerFactory.close();

        return produto;
    }

    /**
     * Retrieves a product by its matriculation code.
     *
     * @param codigoMatricula the matriculation code of the product
     * @return the product with the specified matriculation code
     */
    @Override
    public Produto buscarPorCodMatricula(String codigoMatricula) {
        // Create entity manager factory and entity manager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Build JPQL query
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT p FROM Produto p ");
        sb.append("INNER JOIN Matricula m on m = p.matricula ");
        sb.append("WHERE m.codigo = :codigoMatricula");

        // Start transaction and execute query
        entityManager.getTransaction().begin();
        TypedQuery<Produto> query =
                entityManager.createQuery(sb.toString(), Produto.class);
        query.setParameter("codigoMatricula", codigoMatricula);
        Produto produto = query.getSingleResult();

        // Close entity manager and entity manager factory
        entityManager.close();
        entityManagerFactory.close();

        return produto;
    }

    /**
     * Retrieves a product by matricula.
     *
     * @param matricula The matricula to search for
     * @return The product associated with the matricula
     */
    @Override
    public Produto buscarPorMatricula(Matricula matricula) {
        // Create entity manager factory and entity manager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Build the query string
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT p FROM Produto p ");
        sb.append("INNER JOIN Matricula m on m = p.matricula ");
        sb.append("WHERE m = :matricula");

        // Begin a transaction
        entityManager.getTransaction().begin();

        // Create and execute the query
        TypedQuery<Produto> query = entityManager.createQuery(sb.toString(), Produto.class);
        query.setParameter("matricula", matricula);
        Produto produto = query.getSingleResult();

        // Close entity manager and entity manager factory
        entityManager.close();
        entityManagerFactory.close();

        return produto;
    }

    /**
     * Retrieves all products from the database.
     *
     * @return a list of all products
     */
    @Override
    public List<Produto> buscarTodos() {
        // Create an EntityManagerFactory and EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Create a CriteriaBuilder and CriteriaQuery
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Produto> query = builder.createQuery(Produto.class);

        // Create a Root object for the Produto class
        Root<Produto> root = query.from(Produto.class);

        // Select all columns from the Produto table
        query.select(root);

        // Create a TypedQuery object with the CriteriaQuery
        TypedQuery<Produto> tpQuery = entityManager.createQuery(query);

        // Execute the query and retrieve the result list
        List<Produto> list = tpQuery.getResultList();

        // Close the EntityManager and EntityManagerFactory
        entityManager.close();
        entityManagerFactory.close();

        // Return the list of products
        return list;
    }

    /**
     * Removes a product from the database.
     *
     * @param produto The product to be removed
     */
    @Override
    public void excluir(Produto produto) {
        // Create EntityManagerFactory using the persistence unit name "MODULE-32"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MODULE-32");
        // Create EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin a transaction
        entityManager.getTransaction().begin();
        // Merge the provided product into the persistence context if not already managed
        produto = entityManager.merge(produto);
        // Remove the product from the database
        entityManager.remove(produto);
        // Commit the transaction
        entityManager.getTransaction().commit();

        // Close EntityManager
        entityManager.close();
        // Close EntityManagerFactory
        entityManagerFactory.close();
    }
}

