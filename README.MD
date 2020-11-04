# Padrão de Projeto: Strategy

## O que é um padrão de Projeto?

Padrões de projeto simplificam a vida de um desenvolvedor ao definir uma série de soluções que foram propostas devido à problemas que ocorreram no passado, buscando um código mais limpo e que tenha fácil manutenção.
Devem ser utilizados apenas quando necessários, em situações na qual um padrão pode melhorar e simplificar a lógica do algoritmo de forma a reduzir duplicações e aumentar flexibilidade. Caso seja usado incorretamente, como em situações que não sejam necessários, é muito provável que o código se torne mais complexo.

## Strategy

Strategy é um padrão comportamental que visa encapsular famílias de algoritmos e definir uma estratégia para que sejam utilizados no momento certo.

Definição:
>  “Defina uma família de algoritmos, encapsule cada um, e torne-os intercambiáveis. Strategy permite que o algoritmo varie independente dos clientes que o utilizam.”

Strategy é utilizado quando você precisa que um algoritmo mude em tempo real, em determinadas ocasiões, sem alterar as classes sobre os quais opera.

## Aplicabilidade

É indicado a utilização do Strategy nas seguintes situações:

1. Quando muitas classes relacionadas possuem o mesmo propósito, mas diferem apenas no seu comportamento.

2. Quando se precisa ocultar do usuário estruturas de dados complexas, específicas do algoritmo.

3. Quando uma classe define muitos comportamentos que estão dispostos em uma estrutura condicional.

# Estrutura

![](/resources/Strategy.jpg)

### Strategy

É uma interface comum para todas as subclasses, ou para todos os algoritmos que são suportados. 

### ConcreteStrategy

É a classe concreta que herda da Strategy abstrata, que está definida como as subclasses ConcreteStrategyA, ConcreteStrategyB e ConcreteStrategyA no diagrama da acima.

### Context

É a classe que vai acessar um dos algoritmos das subclasses de interface Strategy.

## Exemplo Prático:

Na computação, existem vários tipos de algoritmos de ordenação que possuem o mesmo propósito: Ordenar. 

Entretanto, esses algoritmos diferem na forma de sua implementação, fato este que ocasiona uma maior rapidez no tempo de execução para determinados casos.

Tendo em vista este aspecto, podemos utilizar a Strategy para definir qual algoritmo deve ser utilizado no momento adequado de uma forma mais organizada.

![](/resources/Diagram.jpg)

Para utilizar a Strategy neste caso, devemos criar uma interface chamada SortingStrategy que deve ser implementada por todas as classes de ordenação (Selection, Insertion, Bubble, Merge e Quick).

```
public interface SortingStrategy {
	public int[] sort(int[] list);
}
```

Com isso, ao invés de instanciar um objeto para cada classe de ordenação, podemos instanciar um único objeto
à partir da Strategy que pode variar em tempo real a sua "estratégia" de operação.

### Sem utilizar Strategy:

```
int[] list1 = {12,25,64,22,11};
	
QuickSort q = new QuickSort();
q.sort(list);

int[] list2 = {1, 2, 3, 4, 8, 7, 6, 4 ,9, 10, 11, 12 ,13 ,14 ,15, 16 ,17, 18, 19, 20};
    
SelectionSort s = new SelectionSort();
s.sort(list);

```

### Utilizando Strategy:

```
int[] list1 = {12,25,64,22,11};
	
SortingStrategy s = new QuickSort();
s.sort(list);

int[] list2 = {1, 2, 3, 4, 8, 7, 6, 4 ,9, 10, 11, 12 ,13 ,14 ,15, 16 ,17, 18, 19, 20};
    
s = new SelectionSort();
s.sort(list);

```
