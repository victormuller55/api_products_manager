# Sistema de API para Gerenciamento de Produtos

Este projeto é uma API desenvolvida em Java com Spring Boot para realizar operações relacionadas ao gerenciamento de produtos. Ele utiliza o IntelliJ como ambiente de desenvolvimento, o MySQL como banco de dados e a biblioteca FlywayDB para gerenciar as migrações do banco de dados.

## Endpoints

- **Cadastrar Produtos:**
  - Endpoint: `/v1/mili/produtos`
  - Métodos: `GET`, `POST`, `DELETE`, `UPDATE`

- **Verificar Média de Valores:**
  - Endpoint: `/v1/mili/produtos/media-valores`
  - Método: `GET`

- **Verificar Produto Mais Caro:**
  - Endpoint: `/v1/mili/produtos/maior-valor`
  - Método: `GET`

## Estrutura do Projeto

O projeto está organizado nas seguintes pastas:

- **models:** Contém as entidades do sistema.
- **controllers:** Define os controladores que gerenciam as requisições e respostas da API.
- **dtos:** Contém os objetos de transferência de dados.
- **repository:** Realiza as interações com o banco de dados.
- **service:** Contém a lógica de negócio.

## Dependências

O projeto utiliza as seguintes dependências principais:

- Spring Boot
- MySQL
- FlywayDB

## Pré-requisitos

- IntelliJ IDEA instalado.
- Java 17 instalado.
- Servidor MySQL configurado.

## Como Rodar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/victormuller55/api_products_manager
   ```
2. **Configure o banco de dados:**
   - Certifique-se de que o MySQL está rodando e configure as credenciais no arquivo `application.properties`.

3. **Execute as migrações do banco de dados:**
   - O FlywayDB gerenciará automaticamente as migrações ao iniciar o projeto.

4. **Execute a aplicação:**
   ```bash
   ./mvnw spring-boot:run
   ```

## Observações

- Certifique-se de que o banco de dados está corretamente configurado antes de iniciar a aplicação.
- Utilize os endpoints para testar as funcionalidades da API.

---

Para dúvidas ou sugestões, entre em contato com Victor Muller.
