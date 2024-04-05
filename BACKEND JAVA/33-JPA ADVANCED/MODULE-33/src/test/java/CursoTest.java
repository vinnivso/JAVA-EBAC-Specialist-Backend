import org.junit.Test;
import org.vinnivso.dao.CursoDAO;
import org.vinnivso.dao.interfaces.ICursoDAO;
import org.vinnivso.domain.Curso;
import static org.junit.Assert.*;


public class CursoTest {
    private ICursoDAO cursoDao;

    public CursoTest() {
        cursoDao = new CursoDAO();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de Java Backend");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
