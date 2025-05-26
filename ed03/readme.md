# Estudo Dirigido 03 - Sistemas de Folha de Pagamento, Impressão e Login

Este projeto implementa três sistemas diferentes utilizando conceitos de Programação Orientada a Objetos como herança, interfaces e polimorfismo.

## 1. Sistema de Folha de Pagamento

O sistema de folha de pagamento implementa diferentes tipos de funcionários com suas próprias regras de cálculo salarial.

### Estrutura:
- `Funcionario` (classe abstrata)
  - Atributos: nome, salarioBase
  - Métodos: exibirDados(), calcularSalario() (abstrato)

- `FuncionarioCLT` (herda de Funcionario)
  - Adicional fixo de R$ 300,00
  - Salário final = salário base + adicional

- `FuncionarioTemporario` (herda de Funcionario)
  - Desconto fixo de R$ 100,00
  - Salário final = salário base - desconto

### Exemplo de uso:
```java
FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.0);
FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.0);
```

## 2. Sistema de Impressão

O sistema de impressão permite a impressão de diferentes tipos de conteúdo digital através de uma interface comum.

### Estrutura:
- `Imprimivel` (interface)
  - Método: imprimir()

Classes que implementam Imprimivel:
- `DocumentoTexto`
  - Atributos: titulo, conteudo
  - Imprime título em maiúsculas e conteúdo

- `ImagemDigital`
  - Atributos: nomeArquivo, resolucao
  - Imprime nome do arquivo e resolução

- `GraficoEstatistico`
  - Atributos: titulo, tipoGrafico
  - Imprime tipo do gráfico e título em maiúsculas

- `RelatorioPDF`
  - Atributos: autor, numeroPaginas
  - Imprime autor e número de páginas

### Exemplo de uso:
```java
DocumentoTexto doc = new DocumentoTexto("Título", "Conteúdo");
ImagemDigital img = new ImagemDigital("foto.jpg", "1920x1080");
doc.imprimir();
img.imprimir();
```

## 3. Sistema de Login

O sistema de login implementa diferentes tipos de usuários com diferentes níveis de acesso e funcionalidades.

### Estrutura:
Interfaces:
- `Autenticavel`
  - Método: autenticar(String senha)

- `Gerenciavel`
  - Métodos: alterarSenha(String novaSenha), bloquearUsuario()

- `Logavel`
  - Método: registrarLog(String operacao)

Classes:
- `Usuario` (classe abstrata)
  - Atributos: login, senha
  - Método: exibirLogin()

- `Administrador` (herda de Usuario, implementa Autenticavel, Gerenciavel, Logavel)
  - Autenticação simples (senha igual)
  - Pode alterar senha, bloquear usuários e registrar logs

- `Visitante` (herda de Usuario)
  - Acesso restrito
  - Sobrescreve exibirLogin() para mostrar mensagem de restrição

- `Cliente` (herda de Usuario, implementa Autenticavel)
  - Autenticação com senha > 6 caracteres
  - Acesso básico ao sistema

### Exemplo de uso:
```java
Administrador admin = new Administrador("admin", "admin123");
Visitante visitante = new Visitante("guest", "qualquer");
Cliente cliente = new Cliente("joao", "segredo123");

admin.autenticar("admin123"); // true
cliente.autenticar("12345"); // false (senha muito curta)
```

## Como Executar

Para executar cada sistema, use as classes principais:
1. `ProgramaFolha` - Demonstra o sistema de folha de pagamento
2. `ProgramaImpressao` - Demonstra o sistema de impressão
3. `ProgramaLogin` - Demonstra o sistema de login

Cada programa principal contém exemplos de uso de todas as funcionalidades implementadas.