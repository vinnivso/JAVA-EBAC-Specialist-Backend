package dao;

import dao.interfaces.ICarroDAO;
import domain.Carro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CarroDAO implements ICarroDAO {
    /**
     * Cadastro de um novo carro.
     *
     * @param carro O carro a ser cadastrado
     * @return O carro cadastrado
     */
    @Override
    public Carro cadastrar(Carro carro) {
        // Cria uma instância do gerenciador de entidades
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TASK-33");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Inicia uma transação e persiste o carro
        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();

        // Fecha o gerenciador de entidades
        entityManager.close();
        entityManagerFactory.close();

        // Retorna o carro cadastrado
        return carro;
    }
}
