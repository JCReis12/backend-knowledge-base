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

