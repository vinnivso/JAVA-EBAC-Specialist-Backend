# TAREFA - MÓDULO 21

## EXPRESSÕES LAMBDAS

- As expressões lambda permitem criar instâncias de interfaces funcionais de maneira concisa e legível. Consequentemente, tornam o código mais limpo e de fácil compreensão.

Exemplo, onde podemos substituir a implementação da interface funcional apresentada abaixo, por uma expressão lambda.

- **INTERFACE FUNCIONAL**
```java
@FunctionalInterface
interface Calculadora {
    int calcular(int a, int b);
}

public class ExemploLambda {
    public static void main(String[] args) {
        /*
         * Podemos criar uma instância da interface
         * Calculadora usando uma classe anônima.
         */
        Calculadora somar = new Calculadora() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        /*
         * Usa a instância da interface Calculadora
         * para calcular a soma de dois números.
         */
        int resultado = somar.calcular(2, 3);
        System.out.println(resultado); // Imprime 5
    }
}
```

- **EXPRESSÃO LAMBDA**
```java
@FunctionalInterface
interface Calculadora {
    int calcular(int a, int b);
}

public class ExemploLambda {

    public static void main(String[] args) {
        Calculadora somar = (int a, int b) -> a + b;

        /*
         * Usa a instância da interface Calculadora
         * para calcular a soma de dois números
         */
        int resultado = somar.calcular(2, 3);
        System.out.println(resultado); // Imprime 5
    }
}
```

- Uma expressão lambda consiste em três partes:
  1.Lista de Parâmetros;
  2.Símbolo ->;
  3.Corpo da expressão.

- **Exemplos de Uso**
- As expressões lambda são especialmente úteis ao trabalhar com coleções, em conjunto com a Stream API. Como podemos ver no exemplo abaixo, utilizamos do uso de expressões lambda para filtrar uma lista de strings e transformar uma lista de números.
- Para filtrar uma lista de strings, podemos utilizar uma expressão lambda como predicado no método filter da Stream API.

```java
import java.util.List;
import java.util.stream.Collectors;

public class ExemploLambda {

    public static void main(String[] args) {
        // Cria uma lista de strings
        List<String> nomes = List.of(
            "Maria",
            "João",
            "Pedro",
            "Ana",
            "Lucas"
        );

        // Filtra os nomes que começam com a letra "M"
        List<String> nomesComM = nomes.stream()
            .filter(nome -> nome.startsWith("M"))
            .collect(Collectors.toList());

        System.out.println(nomesComM); // Imprime [Maria]
    }
}
```

- Nesse caso, a expressão lambda ```nome -> nome.startsWith("M")``` é passada como parâmetro para o método ```filter```. Essa expressão é equivalente a uma instância da interface funcional ```Predicate```, que contém o método abstrato ```test``` que recebe um parâmetro e retorna um boolean.

Outro exemplo de uso de expressões lambda é para transformar cada elemento de uma lista de números em seu quadrado, utilizando o método ```map``` da Stream API.

```java
import java.util.List;
import java.util.stream.Collectors;

public class ExemploLambda {

    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        // Transforma cada número em seu quadrado usando uma expressão lambda
        List<Integer> quadrados = numeros.stream()
            .map(numero -> numero * numero)
            .collect(Collectors.toList());

        System.out.println(quadrados); // Imprime [1, 4, 9, 16, 25]
    }
}
```
Nesse exemplo, a expressão lambda ```numero -> numero * numero``` é utilizada como parâmetro para o método```map```. Essa expressão é equivalente a uma instância da interface funcional ```Function```, que contém o método abstrato ```apply``` que recebe um parâmetro e retorna um valor.

## CONCLUSÃO
- Conclui-se que, as expressões lambda são uma ferramenta poderosa para tornar o código Java mais conciso e legível. Além disso, permitem criar instâncias de interfaces funcionais de forma simplificada, facilitando o trabalho com coleções e a Stream API.
