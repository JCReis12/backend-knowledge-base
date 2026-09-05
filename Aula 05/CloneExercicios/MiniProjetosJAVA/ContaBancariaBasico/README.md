![senai_logo](images/logo.png)

# Mini Projeto: Conta Bancária - Básico

Profº.: Cainã Antunes Silva  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta lista de exercícios é praticar a tarefa de converter as abstrações realizadas utilizando diagrama de classe em código, colocando em prática a essesncia do paradigma de programação orientada à objetos. Além disso, neste projeto você pode  

O paradigma de desenvolvimento de software intitulado Programação Orientada à Objetos é uma ferramenta poderosa que auxilia na construção de sistemas complexos. A abstração é um recurso indispensável para programadores que almejam dominar esta poderosa técnica de programação. Entretando, é necessário dominar a habilidade de converter abstrações em código, ou seja, trazer classes e objetos do mundo das ideias para o mundo real.

Para mais informações acesse [Aula 01: Paradigma POO.](https://cainaantunes.notion.site/Aula-01-Paradigma-POO-23fbde521b3b80149a11f08e9d1eac02?source=copy_link)

***

1. **Projeto 01:** Sistema de Conta Bancária
    <br>
    >**Contexto:** Construa um sistema simples de gerenciamento de contas bancárias.
    
    **Descrição:**
    ```mermaid
        classDiagram
        class ContaBancaria{
            - numero : int
            - saldo : double
            - nome : string
            + depositar (double value) : void
            + sacar (double value): void
        }
        class BankGUI{
            - JTextField txtInput
            - JTextField txtInput
            - JButton btnSaque    
            - JButton btnDeposito  
            - JLabel lblConta       
            - JLabel lblNome        
            - JLabel lblSaldo
            - ContaBancaria conta
            + actionPerformed(ActionEvent e): void
        }
        class JFrame{}
        class App{
            + BankGUI
            + main():void
        }
        App *-- BankGUI
        BankGUI --|> JFrame
        ContaBancaria --* BankGUI
    ```
    
    **Instruções para Execução:**
    1. Implemente a classe `ContaBancaria`. Se atente às possíveis operações inválidas que podem envolver os métodos `depositar(double valor)` e `sacar(double valor)`. Além disso também pessa na questão de encapsulamento para protejer seus atributos internos, espesiamente o `saldo`.
    2. A classe `BankGUI` é responsável por gerar uma interface gráfica para a aplicação utilizando a biblioteca `javax.swing`. Ela já está parcialmente implementada, mas você deve:
        * Instanciar um objeto `ContaBancaria` dentro desta classe (utilise `JOptionPane.showInputDialog()` para solicitar o nome do proprietário da conta).
        * Implementar as lógicas relacinadas aos cliques nos botões `btnDepositar` e `btnSacar`.
        * Atualizar as labels `lblNome`, `lblConta` e `lblSaldo`.
        
        Procure pelas indicações:

        ```Java
        /**************************************************
        ** IMPLEMENTAR AQUI                              **
        **************************************************/
        ```

    3. A classe `App` apenas inicializa a aplicação, você não precisa fazer alterações nela.
    <br>

***
