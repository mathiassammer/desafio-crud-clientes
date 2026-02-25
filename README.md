# DESAFIO: CRUD DE CLIENTES

> Projeto criado na formação Java Spring da DevSuperior.

## Tecnologias utilizadas
- Java 21
- Spring Boot 
- Spring Web
- Spring Data JPA
- Bean Validation
- H2 Database
- Maven

## Especificação
### Projeto
Um projeto Spring Boot contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas:
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

O projeto será em um ambiente de testes configurado acessando o banco de dados H2, usando Maven como gerenciador de dependência e Java como linguagem.

### Base de dados - *import.sql*
O projeto conta com 10 clientes já implantados no banco de dados.

### Exceções
O projeto trata as seguintes exceções:
- Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
- Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As regras de validação são:
    - Nome: não pode ser vazio.
    - Data de nascimento: não pode ser data futura.