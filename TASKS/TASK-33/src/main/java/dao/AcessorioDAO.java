package dao;

import dao.interfaces.IAcessorioDAO;
import domain.Acessorio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AcessorioDAO implements IAcessorioDAO {
    /**
     * Cadastra um novo acessório no banco de dados.
     *
     * @param acessorio O objeto de acessório a ser cadastrado
     * @return O objeto de acessório cadastrado
     */
    @Override
    public Acessorio cadastrar(Acessorio acessorio) {
        // Cria a fábrica de gerenciadores de entidades
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TASK-33");
        // Cria um gerenciador de entidades
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Inicia a transação
        entityManager.getTransaction().begin();
        // Persiste o acessório no banco de dados
        entityManager.persist(acessorio);
        // Comita a transação
        entityManager.getTransaction().commit();

        // Fecha o gerenciador de entidades
        entityManager.close();
        // Fecha a fábrica de gerenciadores de entidades
        entityManagerFactory.close();

        return acessorio;
    }
}
