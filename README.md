# Sistema de Livraria

Aplicação de console desenvolvida em Java para simular o gerenciamento de uma biblioteca. É possível consultar livros disponíveis, realizar empréstimos, devolver livros e listar os empréstimos ativos.

## Requisitos

- Java 21 ou superior
- Maven

## Como executar

Na raiz do projeto, compile com Maven:

```bash
mvn clean package
```

Depois, execute a aplicação:

```bash
java -cp target/classes br.com.guilhermemessias.Main
```

Também é possível abrir o projeto em uma IDE com suporte a Maven e executar a classe `Main`.

## Como usar

Ao iniciar, o sistema pergunta se você deseja visualizar os livros disponíveis:

1. Escolha `1` para exibir os livros disponíveis. Cada livro é apresentado com seu ID, título e autor.
2. Escolha `2` para encerrar o sistema.

Depois de exibir os livros, o menu de empréstimos oferece estas opções:

1. **Realizar empréstimo:** informe o ID de um livro disponível e o nome do cliente. O livro é marcado como indisponível e o empréstimo é registrado.
2. **Devolver livro:** informe o ID do livro emprestado. Ele volta a ficar disponível.
3. **Listar livros emprestados:** exibe os empréstimos ativos.
4. **Voltar ao menu principal.**

Os IDs são UUIDs gerados quando os livros são criados. Para emprestar ou devolver um livro, use o ID exibido na listagem.

## Dados iniciais

Os dados de exemplo são criados no construtor de `Library`. O catálogo inicial contém:

- **Machado de Assis:** *Dom Casmurro* e *Memórias Póstumas de Brás Cubas*
- **Clarice Lispector:** *A Hora da Estrela*
- **George Orwell:** *1984* e *A Revolução dos Bichos*

Todos os livros começam disponíveis. Os dados ficam somente na memória; ao encerrar e iniciar novamente o programa, o catálogo volta ao estado inicial e os empréstimos anteriores não são mantidos.

## Organização do código

As classes estão no pacote `br.com.guilhermemessias`, em `src/main/java/br/com/guilhermemessias/`.

- **`Main`:** ponto de entrada. Cria a biblioteca e inicia o menu.
- **`Library`:** mantém as listas de livros, autores e empréstimos e inicializa o catálogo de exemplo.
- **`Author`:** representa um autor, com ID, nome e data de nascimento.
- **`Book`:** representa um livro, associado a um autor e com estado de disponibilidade.
- **`Loan`:** representa um empréstimo, relacionando livro, nome do cliente e datas de empréstimo e devolução.
- **`Menu`:** implementa a interação com o usuário, a listagem de livros disponíveis e emprestados, os empréstimos e as devoluções.

## Observação

A aplicação é um exercício de console e mantém os dados em memória. A entrada de nomes e IDs usa `Scanner`; a leitura de linhas após opções numéricas pode consumir a quebra de linha pendente, então a leitura do nome do cliente ou do ID na devolução pode precisar de ajuste para funcionar corretamente em todas as sequências de entrada.
