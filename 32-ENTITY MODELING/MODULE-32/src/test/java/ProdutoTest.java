import org.junit.After;
import org.junit.Test;
import org.vinnivso.dao.CursoDAO;
import org.vinnivso.dao.MatriculaDAO;
import org.vinnivso.dao.ProdutoDAO;
import org.vinnivso.dao.interfaces.ICursoDAO;
import org.vinnivso.dao.interfaces.IMatriculaDAO;
import org.vinnivso.dao.interfaces.IProdutoDAO;
import org.vinnivso.domain.Curso;
import org.vinnivso.domain.Matricula;
import org.vinnivso.domain.Produto;

import static org.junit.Assert.*;


import java.time.Instant;
import java.util.List;

public class ProdutoTest {

    private IMatriculaDAO matriculaDAO;

    private ICursoDAO cursoDAO;

    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        matriculaDAO = new MatriculaDAO();
        cursoDAO = new CursoDAO();
        produtoDAO = new ProdutoDAO();
    }

    @After
    public void end() {
        List<Produto> listProdutos = produtoDAO.buscarTodos();
        listProdutos.forEach(prod -> produtoDAO.excluir(prod));

        List<Matricula> list = matriculaDAO.buscarTodos();
        list.forEach(mat -> matriculaDAO.excluir(mat));

        List<Curso> listCursos = cursoDAO.buscarTodos();
        listCursos.forEach(cur -> cursoDAO.excluir(cur));



    }

    @Test
    public void cadastrarProd_Curso_Matricula(){
        Curso curso = criarCurso("A1");
        Matricula mat = criarMatricula("A1", curso);
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Apostila Back-End  JAVA - MOD32");
        produto.setDigitalFisica("Digital");
        produto.setCurso(curso);
        produto.setMatricula(mat);
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

    }

    private Matricula criarMatricula(String codigo, Curso curso) {
        Matricula matricula = new Matricula();
        matricula.setCodigo(codigo);
        matricula.setDataMatricula(Instant.now());
        matricula.setStatus("ATIVA");
        matricula.setValor(2000d);
        matricula.setCurso(curso);
        return matriculaDAO.cadastrar(matricula);
    }

    private Curso criarCurso(String codigo) {
        Curso curso = new Curso();
        curso.setCodigo(codigo);
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de Java Backend");
        return cursoDAO.cadastrar(curso);
    }


    @Test
    public void pesquisarPorCurso(){

        Curso curso = criarCurso("A1");
        Matricula mat = criarMatricula("A1", curso);
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Apostila Back-End  JAVA - MOD32");
        produto.setDigitalFisica("Digital");
        produto.setCurso(curso);
        produto.setMatricula(mat);
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

        Produto produtoDB = produtoDAO.buscarPorCurso(curso);
        assertNotNull(produtoDB);
        assertEquals(produto.getId(),produtoDB.getId());

    }

    @Test
    public void pesquisarPorCodCurso(){
        Curso curso = criarCurso("A1");
        Matricula mat = criarMatricula("A1", curso);
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Apostila Back-End  JAVA - MOD32");
        produto.setDigitalFisica("Digital");
        produto.setCurso(curso);
        produto.setMatricula(mat);
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

        Produto produtoDB = produtoDAO.buscarPorCodCurso(curso.getCodigo());
        assertNotNull(produtoDB);
        assertEquals(produto.getId(),produtoDB.getId());
    }

    @Test
    public void pesquisarPorMatricula(){

        Curso curso = criarCurso("A1");
        Matricula mat = criarMatricula("A1", curso);
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Apostila Back-End  JAVA - MOD32");
        produto.setDigitalFisica("Digital");
        produto.setCurso(curso);
        produto.setMatricula(mat);
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

        Produto produtoDB = produtoDAO.buscarPorMatricula(mat);
        assertNotNull(produtoDB);
        assertEquals(produto.getId(),produtoDB.getId());

    }

    @Test
    public void pesquisarPorCodMatricula(){
        Curso curso = criarCurso("A1");
        Matricula mat = criarMatricula("A1", curso);
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Apostila Back-End  JAVA - MOD32");
        produto.setDigitalFisica("Digital");
        produto.setCurso(curso);
        produto.setMatricula(mat);
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

        Produto produtoDB = produtoDAO.buscarPorCodMatricula(mat.getCodigo());
        assertNotNull(produtoDB);
        assertEquals(produto.getId(),produtoDB.getId());
    }
}

