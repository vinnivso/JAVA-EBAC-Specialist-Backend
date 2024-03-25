import org.junit.Test;
import org.vinnivso.dao.AlunoDAO;
import org.vinnivso.dao.ComputadorDAO;
import org.vinnivso.dao.CursoDAO;
import org.vinnivso.dao.MatriculaDAO;
import org.vinnivso.dao.interfaces.IAlunoDAO;
import org.vinnivso.dao.interfaces.IComputadorDAO;
import org.vinnivso.dao.interfaces.ICursoDAO;
import org.vinnivso.dao.interfaces.IMatriculaDAO;
import org.vinnivso.domain.Aluno;
import org.vinnivso.domain.Computador;
import org.vinnivso.domain.Curso;
import org.vinnivso.domain.Matricula;
import static org.junit.Assert.*;


import java.time.Instant;

public class MatriculaTest {
    private IMatriculaDAO matriculaDao;

    private ICursoDAO cursoDao;

    private IAlunoDAO alunoDao;

    private IComputadorDAO computadorDao;

    public MatriculaTest() {
        matriculaDao = new MatriculaDAO();
        cursoDao = new CursoDAO();
        alunoDao = new AlunoDAO();
        computadorDao = new ComputadorDAO();
    }

    @Test
    public void cadastrar() {
        Curso curso = criarCurso("A1");
        Aluno aluno = criarAluno("A1");

        Matricula mat = new Matricula();
        mat.setCodigo("A1");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(2000d);
        mat.setCurso(curso);
        mat.setAluno(aluno);

        aluno.setMatricula(mat);
        mat = matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());

        Matricula matBD = matriculaDao.buscarPorCodigoCurso(mat.getCodigo());
        assertNotNull(matBD);
        assertEquals(mat.getId(), matBD.getId());

        Matricula matBDObj = matriculaDao.buscarPorCurso(curso);
        assertNotNull(matBDObj);
        assertEquals(mat.getId(), matBDObj.getId());
    }

    private Computador criarComputador(String codigo) {
        Computador comp = new Computador();
        comp.setCodigo(codigo);
        comp.setDescricao("Comp 1");
        return comp;
        //return computadorDao.cadastrar(comp);
    }

    private Aluno criarAluno(String codigo) {
        Computador comp = criarComputador("A1");
        Computador comp2 = criarComputador("A2");
        Aluno aluno = new Aluno();
        aluno.setCodigo(codigo);
        aluno.setNome("Rodrigo");
        aluno.add(comp);
        aluno.add(comp2);
        //comp.add(aluno);
        //comp2.add(aluno);
        return alunoDao.cadastrar(aluno);
    }

    private Curso criarCurso(String codigo) {
        Curso curso = new Curso();
        curso.setCodigo(codigo);
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de Java Backend");
        return cursoDao.cadastrar(curso);
    }
}
