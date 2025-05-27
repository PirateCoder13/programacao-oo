# Exercício de Programação Orientada a Objetos - ED03

Este projeto contém três programas Java, cada um demonstrando conceitos de orientação a objetos como **herança**, **polimorfismo** e **interfaces**.  
**Todos os códigos estão documentados com [Javadoc](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html).**

---

## 1. Programa de Impressão (`ProgramaImpressao`)

Demonstra o uso de **interfaces** e **polimorfismo**.

- **Interface `Imprimivel`**  
  Define o método `void imprimir();` que deve ser implementado por qualquer classe que possa ser impressa.

- **Classe `DocumentoTexto`**  
  Representa um documento textual com título e conteúdo.  
  O método `imprimir()` exibe o título em letras maiúsculas e o conteúdo logo abaixo.

- **Classe `ImagemDigital`**  
  Representa uma imagem digital com nome do arquivo e resolução.  
  O método `imprimir()` exibe o nome do arquivo e a resolução.

- **Classe `ProgramaImpressao`**  
  Classe principal que instancia objetos de `DocumentoTexto` e `ImagemDigital` e chama o método `imprimir()` de cada um, demonstrando o polimorfismo.

---

## 2. Programa de Folha de Pagamento (`ProgramaFolha`)

Demonstra **herança** e **métodos abstratos**.

- **Classe Abstrata `Funcionario`**  
  Possui os atributos `nome` e `salarioBase`, além do método abstrato `calcularSalario()` e o método `exibirDados()`.

- **Classe `FuncionarioCLT`**  
  Herda de `Funcionario` e implementa `calcularSalario()` retornando o salário base acrescido de R$ 300.

- **Classe `FuncionarioTemporario`**  
  Herda de `Funcionario` e implementa `calcularSalario()` retornando o salário base descontado de R$ 100.

- **Classe `ProgramaFolha`**  
  Classe principal que cria funcionários dos dois tipos, exibe seus dados e mostra o salário final calculado.

---

## 3. Programa de Login (`ProgramaLogin`)

Demonstra **herança**, **abstração** e **interfaces**.

- **Classe Abstrata `Usuario`**  
  Possui os atributos `login` e `senha`, além do método `exibirLogin()`.

- **Interface `Autenticavel`**  
  Define o método `boolean autenticar(String senha);`.

- **Classe `Administrador`**  
  Herda de `Usuario` e implementa a interface `Autenticavel`.  
  O método `autenticar()` compara a senha informada com a senha do administrador.

- **Classe `ProgramaLogin`**  
  Classe principal que cria um administrador, exibe o login e testa a autenticação com senhas corretas e incorretas.

---

## Documentação

Todos os arquivos Java estão documentados com **Javadoc**.  
Para gerar a documentação HTML, utilize o comando:

```sh
javadoc -d doc ed03/ProgramaImpressao/*.java ed03/ProgramaFolha/*.java ed03/ProgramaLogin/*.java
```

A documentação será gerada na pasta `doc`.

---

Desenvolvido para fins didáticos na disciplina de Programação Orientada a Objetos.