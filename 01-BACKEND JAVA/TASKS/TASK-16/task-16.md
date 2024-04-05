# TAREFA - MÓDULO 16

## INJEÃO DE DEPENDÊNCIAS COM SPRING.

### Referêcia para realização da análise: https://github.com/

- Injeção de dependências é um tipo de inversão de controle que dá nome ao processo de prover instâncias de classes que um objeto precisa para funcionar. A grande vantagem desse conceito é que nós conseguimos programar voltados para interfaces e, com isso, manter o baixo acoplamento entre as classes de um mesmo projeto.
- Essa funcionalidade é a base de todo o ecossistema Spring.

- Exemplo sem injenção, partindo do pressuposto que "RepositorioCliente" é uma interface:

  ```java
  public class ServicoCliente {
  private RepositorioCliente repositorio = new RepositorioClienteImpl ( );
  }
  ```

  - Exemplo com injenção, partindo do pressuposto que "RepositorioCliente" é uma interface:

  ```java
  public class ServicoCliente {
  @Autowired
  private RepositorioCliente repositorio;
  }
  ```