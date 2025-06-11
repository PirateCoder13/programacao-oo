# Estudo Dirigido 04 - Agenda de Contatos

Este projeto implementa uma agenda de contatos em Java, utilizando conceitos de Programação Orientada a Objetos (POO), como herança, polimorfismo, interfaces e abstração.

## Funcionalidades

- **Adicionar Contatos**: Permite cadastrar contatos do tipo Pessoa Física (CPF) ou Pessoa Jurídica (CNPJ).
- **Listar Contatos**: Exibe todos os contatos cadastrados em formato tabular.
- **Atualizar Contatos**: Modifica os dados de um contato existente.
- **Remover Contatos**: Exclui contatos com base no identificador (CPF ou CNPJ).
- **Buscar Contatos**: Localiza contatos pelo identificador (CPF ou CNPJ).

## Estrutura das Classes

### Classes Principais
- `Main`: Classe principal que inicia a aplicação.
- `ControleContato`: Controlador responsável pela lógica de negócios da agenda.
- `VerContato`: Classe responsável pela interação com o usuário.

### Classes de Contatos
- `ContatoBase`: Classe abstrata base para contatos.
- `PessoaFisica`: Representa contatos do tipo Pessoa Física (CPF).
- `PessoaJuridica`: Representa contatos do tipo Pessoa Jurídica (CNPJ).

### Interface
- `Contato`: Define o contrato básico para um contato.

## Exemplo de Uso

### Adicionar Contato
```java
ControleContato controller = new ControleContato();
Contato contato = new PessoaFisica("João Silva", "123456789", "joao@email.com", "12345678901");
controller.adicionar(contato);