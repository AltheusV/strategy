<a href="README-PTBR.MD">
<img src="https://user-images.githubusercontent.com/30200769/116628303-33085400-a925-11eb-85d7-9bbcf3b1a791.png" width="30" alt="pt-br">
<a/>
  
<a href="README.MD">
<img src="https://user-images.githubusercontent.com/30200769/116637950-9b623000-a93b-11eb-9eed-06f587750c48.png" width="30" alt="eng-us">
<a/>

# Design Pattern: Strategy

## What is Design Pattern?

Design Patterns define a series of proposed solutions due to problems that occurred in the past, looking for a cleaner code that is easy to maintain.
They should be used only when necessary, in situations where a pattern can improve and simplify the logic of the algorithm in order to reduce duplications and increase flexibility. If used incorrectly, as in situations that are not needed, it is very likely that the code will become more complex.

## Strategy

Strategy is a behavioral pattern that aims to encapsulate families of algorithms and define a strategy for them to be used at the right time.

Definition:
>  “Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy allows the algorithm to vary independently of the customers who use it.”

Strategy is used when you need an algorithm to change in real time, on certain occasions, without changing the classes on which it operates.

## Applicability

The use of the Strategy is indicated in the following situations:

1. When many classes serve the same purpose, but differ only in behavior.

2. When it's necessary to hide complex data structures from the user, specific to the algorithm.

3. When a class defines many behaviors that is arranged in an extensive conditional structure.

## Structure

![](/resources/Strategy.jpg)

### Strategy

It is a common interface for all subclasses, or for all algorithms that are supported. 

### ConcreteStrategy

It is the concrete class that inherits from the abstract Strategy, which is defined as the subclasses ConcreteStrategyA, ConcreteStrategyB and ConcreteStrategyC in the diagram above.

### Context

It's the class that will access one of the subclass algorithms of the Strategy interface.

## Practical example:

In programming there are several types of sorting algorithms that serve the same purpose: To sort.

However, these algorithms differ in the form of their implementation, a fact that causes greater speed in the execution time for certain cases.

Therefore, we can use the Strategy to define which algorithm should be used at the appropriate time and in a more organized way.

![](/resources/Diagram.jpg)

To use Strategy in this case, we must create an interface called SortingStrategy that must be implemented by all sorting classes (Selection, Insertion, Bubble, Merge and Quick).

```
public interface SortingStrategy {
	public int[] sort(int[] list);
}
```

Thereby, instead of instantiating an object for each class of classification, we can instantiate a single object
from the Strategy that can vary in real time your “strategy” of operation.

### Without using Strategy:

```
int[] list1 = {12,25,64,22,11};
	
QuickSort q = new QuickSort();
q.sort(list);

int[] list2 = {1, 2, 3, 4, 8, 7, 6, 4 ,9, 10, 11, 12 ,13 ,14 ,15, 16 ,17, 18, 19, 20};
    
SelectionSort s = new SelectionSort();
s.sort(list);

```

### Using Strategy:

```
int[] list1 = {12,25,64,22,11};
	
SortingStrategy s = new QuickSort();
s.sort(list);

int[] list2 = {1, 2, 3, 4, 8, 7, 6, 4 ,9, 10, 11, 12 ,13 ,14 ,15, 16 ,17, 18, 19, 20};
    
s = new SelectionSort();
s.sort(list);

```

## Bibliographic References:

[Devmedia - Strategy](https://www.devmedia.com.br/patterns-strategy/18868)

[Devmedia - Strategy Aplicação](https://www.devmedia.com.br/estudo-e-aplicacao-do-padrao-de-projeto-strategy/25856)


[Wikipedia(pt) Strategy](https://pt.wikipedia.org/wiki/Strategy)

[Wikipedia(en) Strategy](https://en.wikipedia.org/wiki/Strategy_pattern)

[UFU - Strategy](http://www.facom.ufu.br/~fabiano/disciplinas/poo2/Aula01-Padrao-Strategy.pdf)

[Medium - Strategy](https://medium.com/mulheres-de-produto/o-que-%C3%A9-strategy-pattern-e-quando-usar-2fc3bcb4873f)

[AlgaWorks - Video Prático sobre Strategy](https://www.youtube.com/watch?v=rC296hM-S4g)

[GeeksforGeeks - Algoritmos de Ordenação](https://www.geeksforgeeks.org/sorting-algorithms/)

