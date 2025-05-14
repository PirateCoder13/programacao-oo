# Sistema Bancário em Java

Este projeto é um sistema bancário simples, desenvolvido em Java, que demonstra conceitos de Programação Orientada a Objetos (POO) utilizando herança, polimorfismo e sobrescrita de métodos.

## Funcionalidades

- **Criação de contas**: Conta Corrente, Conta Poupança e Conta Salário.
- **Operações básicas**: Depósito, saque e transferência entre contas.
- **Aplicação de juros diários**: Cada tipo de conta possui uma regra diferente.
- **Impressão de extrato**: Mostra o saldo antes e depois da aplicação dos juros.

## Estrutura das Classes

- `Conta` (classe abstrata base)
  - Atributos: `cliente`, `saldo`
  - Métodos: `depositar`, `sacar`, `transferir`, `getSaldo`, `aplicarJurosDiarios`, `imprimirExtrato`

- `ContaCorrente`
  - Juros diário: 0,1%
- `ContaPoupanca`
  - Juros diário: 0,08%
- `ContaSalario`
  - Não aplica juros

## Exemplo de Uso

```java
ContaCorrente cc = new ContaCorrente("Alice", 1000);
ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
ContaSalario cs = new ContaSalario("Carlos", 1200);

cc.depositar(200);
cp.sacar(100);
cs.transferir(cc, 300);

double saldoAntesJurosCC = cc.getSaldo();
double saldoAntesJurosCP = cp.getSaldo();
double saldoAntesJurosCS = cs.getSaldo();

cc.aplicarJurosDiarios();
cp.aplicarJurosDiarios();
cs.aplicarJurosDiarios();

cc.imprimirExtrato(saldoAntesJurosCC);
cp.imprimirExtrato(saldoAntesJurosCP);
cs.imprimirExtrato(saldoAntesJurosCS);
```

## Como Executar

1. Compile todos os arquivos Java:
   ```sh
   javac ed02/banco/*.java
   ```

2. Execute o programa principal:
   ```sh
   java ed02.banco.Main
   ```

## Exemplo de Saída

```
======================================
Extrato da Conta Corrente
Cliente: Alice
Saldo antes dos juros: R$ 1500,00
Saldo após os juros:  R$ 1501,50
Juros diário aplicado: 0.10%
======================================
...
```

---

Desenvolvido para fins didáticos em Programação Orientada a Objetos.
```# Sistema Bancário em Java

Este projeto é um sistema bancário simples, desenvolvido em Java, que demonstra conceitos de Programação Orientada a Objetos (POO) utilizando herança, polimorfismo e sobrescrita de métodos.

## Funcionalidades

- **Criação de contas**: Conta Corrente, Conta Poupança e Conta Salário.
- **Operações básicas**: Depósito, saque e transferência entre contas.
- **Aplicação de juros diários**: Cada tipo de conta possui uma regra diferente.
- **Impressão de extrato**: Mostra o saldo antes e depois da aplicação dos juros.

## Estrutura das Classes

- `Conta` (classe abstrata base)
  - Atributos: `cliente`, `saldo`
  - Métodos: `depositar`, `sacar`, `transferir`, `getSaldo`, `aplicarJurosDiarios`, `imprimirExtrato`

- `ContaCorrente`
  - Juros diário: 0,1%
- `ContaPoupanca`
  - Juros diário: 0,08%
- `ContaSalario`
  - Não aplica juros

## Exemplo de Uso

```java
ContaCorrente cc = new ContaCorrente("Alice", 1000);
ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
ContaSalario cs = new ContaSalario("Carlos", 1200);

cc.depositar(200);
cp.sacar(100);
cs.transferir(cc, 300);

double saldoAntesJurosCC = cc.getSaldo();
double saldoAntesJurosCP = cp.getSaldo();
double saldoAntesJurosCS = cs.getSaldo();

cc.aplicarJurosDiarios();
cp.aplicarJurosDiarios();
cs.aplicarJurosDiarios();

cc.imprimirExtrato(saldoAntesJurosCC);
cp.imprimirExtrato(saldoAntesJurosCP);
cs.imprimirExtrato(saldoAntesJurosCS);
```

## Como Executar

1. Compile todos os arquivos Java:
   ```sh
   javac ed02/banco/*.java
   ```

2. Execute o programa principal:
   ```sh
   java ed02.banco.Main
   ```

## Exemplo de Saída

```
======================================
Extrato da Conta Corrente
Cliente: Alice
Saldo antes dos juros: R$ 1500,00
Saldo após os juros:  R$ 1501,50
Juros diário aplicado: 0.10%
======================================
...
```

---

Desenvolvido para fins didáticos em Programação Orientada a Objetos.