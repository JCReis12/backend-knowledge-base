# Aula 01 — Fundamentos de arquitetura e POO

## Arquitetura monolítica

Uma aplicação monolítica é construída e executada como uma unidade única. Suas partes — como interface, regras de negócio e acesso a dados — podem estar organizadas em módulos, mas costumam ser empacotadas e implantadas juntas.

### Vantagens

- É simples de começar, executar e implantar.
- A comunicação entre componentes dentro do processo tende a ser direta.
- Pode ser uma boa escolha para aplicações pequenas ou equipes enxutas.

### Desafios possíveis

- Com o crescimento, o código pode ficar acoplado e mais difícil de compreender e manter.
- Uma alteração ou falha pode afetar a aplicação inteira.
- Escalar apenas uma parte do sistema pode ser difícil, pois a aplicação costuma ser implantada como um todo.

> **Importante:** arquitetura monolítica não é necessariamente ruim. A qualidade depende de como o sistema é organizado e das necessidades do projeto. Modularizar bem um monólito pode manter o código organizado sem exigir a complexidade de vários serviços.

## Programação Orientada a Objetos (POO)

POO é um paradigma de programação que organiza o código em torno de **objetos**, que reúnem dados e comportamentos relacionados. Essa organização pode facilitar a compreensão, a manutenção e a reutilização do código quando aplicada com responsabilidade.

### Conceitos básicos

- **Atributos:** dados ou características associados a uma classe ou objeto.
- **Métodos:** operações ou comportamentos que uma classe ou objeto pode realizar.
- **Classe:** definição que descreve quais atributos e métodos certos objetos podem ter.
- **Objeto:** instância concreta criada a partir de uma classe. Cada objeto pode ter valores próprios para seus atributos.

### Exemplo conceitual

Considere a classe `Pessoa`:

- Atributos: `nome` e `idade`.
- Método: `apresentar()`, que exibe ou retorna uma apresentação da pessoa.

Uma pessoa específica, como Ana, com 20 anos, é um objeto (uma instância) da classe `Pessoa`. Outra instância pode representar João, com valores diferentes.

```text
Classe Pessoa
  atributos: nome, idade
  método: apresentar()

Objeto ana
  nome = "Ana"
  idade = 20
```

## Classe e objeto: uma analogia

Uma analogia filosófica comum relaciona:

- **Classe** ao “mundo das ideias”: uma descrição geral do que algo pode ser.
- **Objeto** ao “mundo sensível”: uma ocorrência concreta, com valores próprios.

Por exemplo, a classe `Pessoa` descreve uma categoria; Ana é uma pessoa concreta. Essa comparação ajuda a visualizar a diferença, mas é uma analogia — não uma regra técnica da POO.

