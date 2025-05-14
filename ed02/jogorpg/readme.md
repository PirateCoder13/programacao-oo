# Sistema RPG em Java

Este projeto é um sistema simples de RPG em Java, demonstrando conceitos de Programação Orientada a Objetos (POO) como herança, polimorfismo e sobrescrita de métodos.

## Funcionalidades

- **Criação de personagens**: Guerreiro, Mago e Arqueiro.
- **Atributos**: Cada personagem possui vida e ataque.
- **Ações**: Atacar outros personagens e usar habilidades especiais.
- **Exibição de status**: Mostra os atributos atuais de cada personagem.

## Estrutura das Classes

- `Personagem` (classe abstrata base)
  - Atributos: `nome`, `vida`, `ataque`
  - Métodos: `status`, `atacar`, `receberDano`, `usarHabilidadeEspecial`

- `Guerreiro`
  - Habilidade especial: aumenta o ataque.
- `Mago`
  - Habilidade especial: recupera vida.
- `Arqueiro`
  - Habilidade especial: ataque duplo.

## Exemplo de Uso

```java
Guerreiro g = new Guerreiro("Thorgal");
Mago m = new Mago("Merlino");
Arqueiro a = new Arqueiro("Legolis");

g.status();
m.status();
a.status();

g.atacar(m);
m.usarHabilidadeEspecial();
a.usarHabilidadeEspecial();

g.status();
m.status();
a.status();
```

## Como Executar

1. Compile todos os arquivos Java:
   ```sh
   javac ed02/jogorpg/*.java
   ```

2. Execute o programa principal:
   ```sh
   java ed02.jogorpg.MainRpg
   ```

## Exemplo de Saída

```
Thorgal - Vida: 120 | Ataque: 20
Merlino - Vida: 80 | Ataque: 25
Legolis - Vida: 100 | Ataque: 18
Thorgal ataca Merlino causando 20 de dano!
Merlino usa Cura Mágica! Vida recuperada.
Legolis usa Flecha Dupla! Ataque realizado duas vezes.
Thorgal - Vida: 120 | Ataque: 20
Merlino - Vida: 80 | Ataque: 25
Legolis - Vida: 100 | Ataque: 23
```

## Documentação

Todos os arquivos Java estão documentados com [Javadoc](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html).  
Para gerar a documentação HTML, utilize:

```sh
javadoc -d doc ed02/jogorpg/*.java
```

A documentação será gerada na pasta `doc`.

---

Desenvolvido para fins didáticos em Programação Orientada a Objetos.