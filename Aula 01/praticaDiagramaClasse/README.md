# Exercício de Abstração

Diagramas de classe são utilizados para representar os objetos que irão compor um sistema.

Veja abaixo um exemplo de uma Classe representada em diagrama:
```mermaid
    classDiagram
    class Nome{
        - atributos
        + metodos()void
    }
```

1. Modele uma classe que represente um carro.
```mermaid
    classDiagram
    class Carro{
        - String cor
        - String modelo
        - String placa
        - String marca
        - Double velocMax
        + acelerar()void
        + freiar()void
        + ligar()void
        + desligar()
    }
```
