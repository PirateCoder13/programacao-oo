# Estudo Dirigido 03 - Programação Orientada a Objetos

Este diretório contém os exercícios do Estudo Dirigido 03, abordando conceitos de Programação Orientada a Objetos (POO) em Java, como herança, polimorfismo, interfaces e abstração.

## Estrutura do Projeto

O projeto está dividido em três módulos principais:

### 1. Folha de Pagamento
- **Descrição**: Sistema para cálculo de salários de funcionários, com diferentes tipos de contratos (CLT e Temporário).
- **Classes**:
  - `Funcionario`: Classe abstrata base para funcionários.
  - `FuncionarioCLT`: Implementação para funcionários CLT.
  - `FuncionarioTemporario`: Implementação para funcionários temporários.
  - `ProgramaFolha`: Classe principal para demonstração.
- **Como executar**:
  ```bash
  java ed03.folha_pagamento.ProgramaFolha
  ```

### 2. Controle de Estoque
- **Descrição**: Sistema para gerenciamento de estoque de produtos, com controle de entrada e saída.
- **Classes**:
  - `Produto`: Classe abstrata base para produtos.
  - `ProdutoPerecivel`: Implementação para produtos perecíveis.
  - `ProdutoNaoPerecivel`: Implementação para produtos não perecíveis.
  - `ProgramaEstoque`: Classe principal para demonstração.
- **Como executar**:
  ```bash
  java ed03.controle_estoque.ProgramaEstoque
  ```

### 3. Sistema Escolar
- **Descrição**: Sistema para gerenciamento de uma instituição de ensino, com controle de alunos, professores e disciplinas.
- **Classes**:
  - `Pessoa`: Classe abstrata base para pessoas da instituição.
  - `Aluno`: Implementação para alunos.
  - `Professor`: Implementação para professores.
  - `Disciplina`: Classe para disciplinas.
  - `ProgramaEscola`: Classe principal para demonstração.
- **Como executar**:
  ```bash
  java ed03.sistema_escolar.ProgramaEscola
  ```

## Observações Gerais
- Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
- Os exercícios foram desenvolvidos e testados na versão 11 do JDK.
- Para compilar os exercícios, navegue até o diretório do exercício desejado e execute `javac *.java`.
- Para executar os exercícios, utilize o comando `java NomeDaClassePrincipal` conforme descrito nas seções acima.
