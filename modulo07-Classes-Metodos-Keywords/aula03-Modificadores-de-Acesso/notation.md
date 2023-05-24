# Modificadores de Acesso

  - Os modificadores de acesso são padrões de visibilidade de acessos às classes, atributos e métodos. Estes modificadores são palavraschaves reservadas pelo Java. Por exemplo, quando um programa cria (instancia) um objeto da classe Banco, a variável senha é encapsulada (ocultada) no objeto onde pode ser acessada apenas por métodos da classe do objeto, os métodos getters e setters, que manipulam a variável de instância.

  - **private:** O modificador de acesso private quando aplicado a um atributo ou a um método indica que os mesmos só podem ser acessados de dentro da classe que os criou;
  - **protected:** A instrução protected indica que o método ou a variável assim declarada possa ser acessada somente dentro do pacote em que está contida através de uma subclasse;
  - **public:** A instrução public indica que a classe, método ou variável assim declarada possa ser acessada em qualquer lugar, a qualquer momento da execução do programa;
  - Default (Padrão): A classe e seus membros são acessíveis somente por classes do mesmo pacote.