## README - Cadastro de Produtos

Este projeto é uma atualização do projeto [Trabalho-Cadastro-de-Produtos](https://github.com/igorpdm/Trabalho-Cadastro-de-Produtos) utilizando programação orientada a objetos.

### Descrição

O projeto "Cadastro de Produtos" é um sistema de cadastro e venda de produtos. Ele permite que produtos sejam cadastrados, alterados e excluídos, além de possibilitar a realização de vendas, adicionando produtos ao carrinho e finalizando a compra.

### Funcionalidades

- Cadastro de produtos
- Alteração de produtos
- Exclusão de produtos
- Listagem de produtos
- Adição de produtos ao carrinho
- Exclusão de produtos do carrinho
- Finalização de venda

### Utilização

1. Clone o repositório do projeto:

```bash
git clone https://github.com/igorpdm/Trabalho-Cadastro-de-Produtos.git
```

2. Compile e execute o programa:

```bash
javac CadastroDeProdutos/Programa.java
java CadastroDeProdutos.Programa
```

3. Na tela inicial, escolha o perfil desejado:

- Digite `1` para entrar como Atendente.
- Digite `2` para entrar como Administrador.

4. Após entrar como Atendente ou Administrador, siga as opções disponíveis no menu.

### Opções do Atendente

- **Opção 1:** Adicionar produtos ao carrinho
- Informe o nome do produto.
- Informe a quantidade do produto que deseja comprar.
- Verifique a listagem dos produtos no carrinho.

- **Opção 2:** Excluir produtos do carrinho
- Informe a posição do produto a ser excluído.
- Verifique a listagem dos produtos no carrinho.

- **Opção 3:** Finalizar venda
- Verifique a listagem dos produtos no carrinho.
- Finalize a compra.

### Opções do Administrador

- **Opção 1:** Inserir produtos
- Informe o código do produto.
- Informe o nome do produto.
- Informe o preço do produto.
- Informe a quantidade em estoque do produto.
- Retorne ao menu principal.

- **Opção 2:** Alterar produtos
- Informe o código do produto a ser alterado.
- Informe o novo nome para o produto.
- Informe o novo preço para o produto.
- Informe a nova quantidade em estoque para o produto.
- Retorne ao menu principal.

- **Opção 3:** Excluir produtos
- Informe o código do produto a ser excluído.
- Retorne ao menu principal.

- **Opção 4:** Gerar a listagem dos produtos
- Escolha uma das opções de listagem disponíveis:
 - 1: Listar todos os produtos.
 - 2: Listar os produtos em ordem alfabética.
 - 3: Buscar um produto específico.
- Retorne ao menu principal.

### Observações

- O programa utiliza o conceito de programação orientada a objetos.
- O código foi atualizado para utilizar classes, objetos e métodos para representar os elementos do sistema.
- Os produtos são armazenados em um vetor de objetos `Produto`.
- Os itens do carrinho são armazenados em uma lista ligada de objetos `ItemCarrinho`.
- O programa foi desenvolvido em Java.


