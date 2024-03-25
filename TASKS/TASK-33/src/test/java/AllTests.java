import dao.AcessorioDAO;
import dao.CarroDAO;
import dao.DonoDAO;
import dao.MarcaDAO;
import dao.interfaces.IAcessorioDAO;
import dao.interfaces.ICarroDAO;
import dao.interfaces.IDonoDAO;
import dao.interfaces.IMarcaDAO;
import domain.Acessorio;
import domain.Carro;
import domain.Dono;
import domain.Marca;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AllTests {
    private IMarcaDAO marcaDao;
    private ICarroDAO carroDao;
    private IAcessorioDAO acessorioDao;
    private IDonoDAO donoDao;

    public AllTests(){
        marcaDao = new MarcaDAO();
        carroDao = new CarroDAO();
        acessorioDao = new AcessorioDAO();
        donoDao = new DonoDAO();
    }

    /**
     * Test method to register a new car with its brand, owner and model.
     */
    @Test
    public void cadastrarTest(){
        // Create a new brand
        Marca marca = criarMarca("AUDI");
        // Create a new car model
        Carro carro = criarCarro("A3");
        // Create a new car owner
        Dono dono = criarDono("Vinicius");

        // Register the brand and the owner
        marcaDao.cadastrar(marca);
        donoDao.cadastrar(dono);

        // Set the car model and brand to the car owner
        dono.setCarro(carro);
        carro.setMarca(marca);
        // Register the car
        carroDao.cadastrar(carro);

        // Check if the objects were created
        assertNotNull(marca);
        assertNotNull(carro);
        assertNotNull(dono);
    }

    /**
     * Creates a new Dono object with the given name.
     *
     * @param nome The name of the Dono object.
     * @return The created Dono object.
     */
    private Dono criarDono(String nome) {
        // Create a new Dono object
        Dono dono = new Dono();

        // Set the code, name, country, and phone number of the Dono object
        dono.setCodigo("A1");
        dono.setNome(nome);
        dono.setPais("Brasil");
        dono.setTelefone(99999999l);

        // Return the created Dono object
        return dono;
    }

    /**
     * Creates an Acessorio object with the given code and item.
     *
     * @param codigo The code of the Acessorio.
     * @param item The item of the Acessorio.
     * @return The created Acessorio object.
     */
    private Acessorio criarAcessorio(String codigo, String item) {
        // Create a new Acessorio object
        Acessorio acessorio = new Acessorio();

        // Set the code of the Acessorio
        acessorio.setCodigo(codigo);

        // Set the item of the Acessorio
        acessorio.setNome(item);

        // Set the description of the Acessorio
        acessorio.setDescricao("Teto de vidro");

        // Set the value of the Acessorio
        acessorio.setValor(BigDecimal.valueOf(4000));

        // Return the created Acessorio object
        return acessorio;
    }

    /**
     * Creates a new Car object based on the given model.
     *
     * @param modelo The model of the car
     * @return The newly created Car object
     */
    private Carro criarCarro(String modelo) {
        // Create a new Car object
        Carro carro = new Carro();

        // Set the code and name of the car to the provided model
        carro.setCodigo(modelo);
        carro.setNome(modelo);

        // Set the value and year of the car
        carro.setValor(BigDecimal.valueOf(300000));
        carro.setAno(2023);

        // Create two accessories and add them to the car
        Acessorio acessorio = criarAcessorio("T1","Teto Solar");
        Acessorio acessorio2 = criarAcessorio("T2","Pelicula Solar");
        carro.addAcc(acessorio);
        carro.addAcc(acessorio2);

        return carro;
    }

    /**
     * Creates a new brand with the given name.
     *
     * @param nome The name of the brand.
     * @return The newly created brand object.
     */
    private Marca criarMarca(String nome) {
        Marca marca = new Marca();
        marca.setCodigo("M1");
        marca.setNome(nome);
        marca.setPais("Alemanha");
        return marca;
    }
}
