# avaliacao_poo_Sarah

Projeto desenvolvido em Java com o objetivo de aplicar, na prática, conceitos fundamentais de Programação Orientada a Objetos (POO).

O sistema simula o gerenciamento de peças de uma loja de roupas, permitindo cadastrar diferentes tipos de peças, armazená-las em um estoque e calcular o preço final considerando regras de desconto.

## Sobre o Projeto

O sistema representa de forma simples uma loja de roupas, trabalhando com diferentes tipos de peças:
    ° Peças femininas
    ° Peças masculinas
    ° Peças infantis

Cada peça possui informações como:

Código
Valor
Quantidade em estoque

Além disso, cada categoria pode possuir comportamentos específicos, como diferentes regras para cálculo de descontos.

## Conceitos de POO:
O projeto utiliza:
    ° Encapsulamento
    ° Abstração
    ° Herança
    ° Polimorfismo
    ° Interface
    ° Associação entre classes

## Estrutura 
A classe abstrata Peca representa as características comuns das peças. Também possui comportamentos compartilhados e define o método abstrato que deve ser implementado pelas subclases.
As classes PecaFeminina, PecaMasculina e PecaInfantil herdam de Peca. além de possui regras especificas para a interface Desconto.
A interface Desconto define um comportamento relacionado ao cálculo de descontos.
A classe Estoque é responsável por armazenar as peças da loja.
A classe Loja representa a loja e possui um estoque, permitindo adicionar peças ao estoque, exibir peças cadastradas e consultar a quantidade total armazenada.
A classe Principal contém o método main para executar e demonstrar o funcionamento do sistema.

## Funcionamento

Ao executar o programa, são criadas diferentes peças e adicionadas ao estoque da loja.

O sistema percorre as peças cadastradas e exibe suas informações, incluindo o preço final, considerando as regras de desconto definidas para cada categoria.

Também é apresentada a quantidade total de peças armazenadas no estoque.

## Tecnologias 
    ° Java
    ° Programação Orientada a Objetos
    ° VSCode

## Finalidade acadêmica

Este projeto foi desenvolvido como avaliação prática para demonstrar a aplicação dos principais conceitos de Programação Orientada a Objetos em Java, utilizando um sistema simples de gerenciamento de uma loja de roupas.