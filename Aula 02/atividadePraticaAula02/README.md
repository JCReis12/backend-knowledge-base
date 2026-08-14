## Mini Projeto: Conta Bancária

> Objetivo: Simular um funcionamento de uma conta bancária de uma forma simples

```mermaid
    classDiagram
    class ContaBancaria{
        - int numero
        - double saldo
        + depositar(double valor)boolean
        + depositar(int numero, double valor)boolean
        + sacar(double valor)boolean

    }


```