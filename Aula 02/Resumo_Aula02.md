# Aula 02 — Estrutura de uma Classe Java

## 1. Construtores
O construtor é um método especial de uma classe que é executado automaticamente quando criamos uma nova instância utilizando `new`.
Sua principal função é inicializar os atributos do objeto, garantindo que ele seja criado com um estado inicial válido.

### Características
- Possui o mesmo nome da classe.
- Não possui tipo de retorno, nem mesmo `void`.
- É chamado automaticamente ao utilizar `new`.
- Pode receber parâmetros para definir os valores iniciais dos atributos.
- Uma classe pode possuir mais de um construtor, utilizando sobrecarga.

### Exemplo
```java
public class ContaBancaria {

    private int numero;
    private double saldo;
    private String titular;

    public ContaBancaria(int numero, String titular) {

        this.numero = numero;
        this.saldo = 0;
        this.titular = titular;

    }

}
```

Ao criar uma conta:
```java
ContaBancaria conta = new ContaBancaria(12345, "João");
```

O construtor é executado automaticamente e inicializa:
- `numero`  → `12345`
- `saldo`   → `0`
- `titular` → `"João"`

### `this`
O `this` representa o próprio objeto que está sendo criado ou manipulado.

No exemplo:
```java
this.numero = numero;
```
O primeiro `numero` é o atributo da classe, enquanto o segundo `numero` é o parâmetro recebido pelo construtor.

```text
this.numero = numero;
     │           │
     │           └── parâmetro
     │
     └── atributo da classe
```

---

## 2. `toString()`
O método `toString()` serve para fornecer uma representação em texto do objeto.
Por padrão, ele é herdado da classe `Object`. Sua implementação padrão não apresenta as informações úteis dos atributos do objeto, então podemos sobrescrevê-lo para definir o que queremos exibir.

### Exemplo
```java
@Override
public String toString() {

    return "ContaBancaria{" +
            "numero=" + numero +
            ", saldo=" + saldo +
            ", titular='" + titular + ''' +
            '}';

}
```

Assim, quando fizermos:
```java
System.out.println(conta);
```
o Java utilizará o `toString()` para transformar o objeto em uma representação textual.

Por exemplo:
```text
ContaBancaria{numero=12345, saldo=500.0, titular='João'}
```

### `@Override`
A anotação `@Override` indica que estamos sobrescrevendo um método que já existe na superclasse.
Nesse caso, estamos substituindo o comportamento do `toString()` herdado de `Object` por uma implementação própria.

### Para que serve?
O `toString()` é útil principalmente para:
- Exibir informações do objeto.
- Facilitar a depuração.
- Mostrar objetos no console.
- Registrar informações em logs.

---

## 3. `private` nos atributos
O uso de `private` está relacionado ao princípio de encapsulamento da Programação Orientada a Objetos.
Em uma classe, os atributos normalmente devem ser declarados como `private`:

```java
private int numero;
private double saldo;
private String titular;
```

Isso significa que esses atributos só podem ser acessados diretamente dentro da própria classe.
Por exemplo, não podemos fazer diretamente de outra classe:
```java
conta.saldo = 1000;
```
se `saldo` for `private`.

### Por que utilizar `private`?
O encapsulamento serve para esconder os detalhes internos da classe e controlar a maneira como outras partes do programa interagem com ela.
Isso ajuda a:
- Proteger os dados.
- Evitar alterações indevidas.
- Facilitar a manutenção.
- Reduzir o acoplamento.
- Manter as regras da classe sob controle.

Por exemplo, em uma conta bancária, não seria interessante permitir que qualquer parte do programa alterasse diretamente:
```java
saldo = -5000;
```
A classe deve controlar como o saldo pode ser alterado.

### Encapsulamento
```text
┌─────────────────────────────┐
│       ContaBancaria         │
│                             │
│  private int numero         │
│  private double saldo       │
│  private String titular     │
│                             │
│  Métodos controlam acesso   │
└─────────────────────────────┘
              │
              ▼
       Outras classes
              │
              ▼
     Acesso controlado
```

---

## 4. Getters e Setters
Como os atributos são `private`, precisamos de uma forma controlada de consultar ou modificar seus valores.
Para isso utilizamos os getters e setters.

### Getter
O getter é utilizado para obter/ler o valor de um atributo.

**Exemplo:**
```java
public double getSaldo() {

    return saldo;

}
```

Podemos então fazer:
```java
System.out.println(conta.getSaldo());
```
O método retorna o valor armazenado em `saldo`.

**Padrão:**
```java
public Tipo getAtributo() {

    return atributo;

}
```

**Exemplo:**
```java
public int getNumero() {

    return numero;

}

public String getTitular() {

    return titular;

}
```

### Setter
O setter é utilizado para alterar/modificar o valor de um atributo.

**Exemplo:**
```java
public void setSaldo(double saldo) {

    this.saldo = saldo;

}
```

Podemos fazer:
```java
conta.setSaldo(500);
```

**Padrão:**
```java
public void setAtributo(Tipo atributo) {

    this.atributo = atributo;

}
```

**Exemplo:**
```java
public void setTitular(String titular) {

    this.titular = titular;

}
```

### Getter + Setter e encapsulamento
A ideia não é simplesmente transformar todo atributo `private` em algo livremente modificável.
Os métodos podem permitir que a classe controle as alterações.
Por exemplo, considerando uma conta bancária, podemos ter uma regra de negócio que impeça a alteração do número da conta depois de sua criação.
Nesse caso, poderíamos disponibilizar:

```java
public int getNumero() {

    return numero;

}
```
mas não necessariamente:
```java
public void setNumero(int numero) {

    this.numero = numero;

}
```
Assim, outras classes conseguem consultar o número, mas não alterá-lo diretamente.

> **Importante:** Getters e setters são mecanismos de acesso controlado aos atributos. O uso de um setter deve considerar as regras de negócio da classe.

---

## 5. Sobrecarga de métodos
A sobrecarga de métodos permite criar dois ou mais métodos com o mesmo nome dentro da mesma classe, desde que eles possuam listas de argumentos diferentes.

Por exemplo:
```java
public void depositar(double valor) {

    saldo += valor;

}
```
E:
```java
public boolean depositar(double valor, int numero) {

    if (this.numero != numero || valor <= 0) {

        return false;

    }

    saldo += valor;

    return true;

}
```

Os dois métodos possuem o mesmo nome: `depositar()`

Porém, possuem parâmetros diferentes:
- `depositar(double valor)`
- `depositar(double valor, int numero)`

O Java consegue identificar qual método deve executar com base nos argumentos fornecidos.

### Exemplo
```java
conta.depositar(500);
```
Utiliza: `depositar(double valor)`

Enquanto:
```java
conta.depositar(500, 12345);
```
Utiliza: `depositar(double valor, int numero)`

### Por que utilizar sobrecarga?
A sobrecarga ajuda em:
- **Legibilidade:** Podemos utilizar o mesmo nome para operações relacionadas.
- **Flexibilidade:** O método pode receber diferentes quantidades ou tipos de informações.
- **Organização:** Evita criar vários métodos com nomes diferentes para representar a mesma operação.

---

## 6. Sobrecarga de construtores
A sobrecarga também pode ser utilizada nos construtores.

Por exemplo:
```java
public ContaBancaria(int numero, String titular) {

    this.numero = numero;
    this.titular = titular;
    this.saldo = 0.0;

}
```

Podemos ter outro:
```java
public ContaBancaria(int numero, String titular, double bonus) {

    this(numero, titular);
    this.saldo = bonus;

}
```

Agora existem duas formas de criar uma `ContaBancaria`:
```java
ContaBancaria conta1 = new ContaBancaria(12345, "João");
```
Ou:
```java
ContaBancaria conta2 = new ContaBancaria(12345, "João", 500);
```
Isso é possível porque os construtores possuem parâmetros diferentes.

### Resumindo
```text
ContaBancaria()
       │
       ├── (int numero, String titular)
       │
       └── (int numero, String titular, double bonus)
```

---

## 7. Estrutura de uma classe Java
Uma classe Java pode possuir diferentes componentes:

```text
CLASSE
│
├── Atributos
│   └── private → protege os dados
│
├── Construtor
│   └── inicializa o objeto
│
├── Getters
│   └── permitem consultar dados
│
├── Setters
│   └── permitem alterar dados
│
├── Métodos
│   └── representam comportamentos
│
├── Sobrecarga
│   └── permite diferentes versões do mesmo método
│
└── toString()
    └── representa o objeto como texto
```

---

## 8. Exemplo completo
```java
public class ContaBancaria {

    private int numero;
    private double saldo;
    private String titular;

    // Construtor
    public ContaBancaria(int numero, String titular) {

        this.numero = numero;
        this.saldo = 0;
        this.titular = titular;

    }

    // Getter
    public int getNumero() {

        return numero;

    }

    // Getter
    public double getSaldo() {

        return saldo;

    }

    // Getter
    public String getTitular() {

        return titular;

    }

    // Setter
    public void setTitular(String titular) {

        this.titular = titular;

    }

    // Método
    public void depositar(double valor) {

        saldo += valor;

    }

    // Sobrecarga do método depositar
    public boolean depositar(double valor, int numero) {

        if (this.numero != numero || valor <= 0) {

            return false;

        }

        saldo += valor;

        return true;

    }

    // toString
    @Override
    public String toString() {

        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + ''' +
                '}';

    }

}
```

---

## 9. Como os conceitos se relacionam
```text
                    CLASSE
                       │
          ┌────────────┼────────────┐
          │            │            │
          ▼            ▼            ▼
      Atributos    Construtor     Métodos
          │            │            │
          ▼            ▼            ▼
       private     Inicializa    Comportamentos
          │
          ▼
   Encapsulamento
          │
      ┌───┴────┐
      │        │
      ▼        ▼
   Getter    Setter
      │        │
      ▼        ▼
     Lê      Altera


Métodos
   │
   ▼
Sobrecarga
   │
   ├── Mesmo nome
   └── Parâmetros diferentes


Classe
   │
   ▼
toString()
   │
   ▼
Representação textual
```

---

## 10. Resumo para estudar

| Tópico | Função principal |
| :--- | :--- |
| **Construtor** | Inicializar o objeto quando ele é criado |
| **`toString()`** | Representar o objeto em formato de texto |
| **`private`** | Restringir o acesso direto aos atributos |
| **Getter** | Ler/obter o valor de um atributo |
| **Setter** | Alterar o valor de um atributo de forma controlada |
| **Sobrecarga** | Permitir métodos/construtores com mesmo nome e parâmetros diferentes |

---

## 11. Resumo rápido

### Construtor
Cria e inicializa o objeto.
```java
new ContaBancaria(12345, "João");
```

### `private`
Protege os atributos contra acesso direto.
```java
private double saldo;
```

### Getter
Permite consultar um atributo.
```java
public double getSaldo() {
    return saldo;
}
```

### Setter
Permite alterar um atributo.
```java
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
```

### `toString()`
Transforma o objeto em uma representação textual.
```java
@Override
public String toString() {
    return "ContaBancaria{...}";
}
```

### Sobrecarga
Permite vários métodos com o mesmo nome, mas parâmetros diferentes.
```java
depositar(double valor)
depositar(double valor, int numero)
```

---

## 12. Ideia central da aula
Uma classe Java não é apenas um conjunto de variáveis.
Ela pode encapsular:

- **Dados** → atributos.
- **Proteção dos dados** → `private`.
- **Inicialização** → construtores.
- **Acesso aos dados** → getters e setters.
- **Comportamentos** → métodos.
- **Variações de comportamentos** → sobrecarga.
- **Representação textual** → `toString()`.

Isso começa a mostrar uma das ideias fundamentais da Programação Orientada a Objetos (POO):

> **Uma classe reúne dados e comportamentos relacionados, controlando como esses dados podem ser acessados e modificados.**
