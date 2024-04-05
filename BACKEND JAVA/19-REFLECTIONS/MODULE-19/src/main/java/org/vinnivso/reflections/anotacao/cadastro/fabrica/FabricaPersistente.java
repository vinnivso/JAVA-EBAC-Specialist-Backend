package org.vinnivso.reflections.anotacao.cadastro.fabrica;


import org.vinnivso.reflections.anotacao.cadastro.domain.Persistente;
import org.vinnivso.reflections.anotacao.cadastro.exception.DadosInvalidosException;

/**
 *
 *
 * Fábrica que sabe criar objetos da aplicação
 */
public interface FabricaPersistente {

    /**
     Método que sabe criar objetos da aplicação
     *
     * @param dados São os dados a serem cadastrados no banco de dados
     * @return Retorna o objeto <b>Persistente</b> que é pai de todas as entidades da aplicação
     * @throws DadosInvalidosException quando os dados estão inválidos
     */
    Persistente criarObjeto(String dados[]) throws DadosInvalidosException;

}
