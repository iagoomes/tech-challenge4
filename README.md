# Documentação do Projeto - Sistema de Gerenciamento de Pedidos

## Visão Geral
O Sistema de Gerenciamento de Pedidos é uma aplicação baseada em arquitetura de microsserviços desenvolvida com o ecossistema Spring. O objetivo é fornecer uma solução eficiente para o gerenciamento de clientes, produtos, pedidos e logística de entrega. Cada microsserviço é responsável por uma parte do sistema, garantindo autonomia, escalabilidade e desacoplamento.

## Tecnologias Utilizadas
O projeto utiliza diversas tecnologias para garantir um sistema robusto e bem estruturado. Utilizamos o padrão **Clean Architecture** para organizar o código e garantir a separação de responsabilidades. No entanto, enfrentamos algumas dificuldades para implementar uma arquitetura extremamente limpa devido à forte dependência do framework para funcionalidades como Spring Batch e Kafka.

- **Linguagem de Programação:** Java
- **Framework:** Spring Boot
- **Gerenciamento de Dependências:** 
    - **Maven** Utilizado por todos os microsserviços, exceto o de logística
    - **Gradle** Utilizado exclusivamente pelo microsserviço de logística
- **Persistência de Dados:**
    - **PostgreSQL:** Utilizado exclusivamente pelo microsserviço de logística
    - **H2 Database:** Utilizado pelos demais microsserviços para armazenar dados temporários
- **Comunicação entre Microsserviços:** Apache Kafka (Spring Cloud Stream) para comunicação assincrona entre o microserviço de pedidos e logística
- **Processamento em Lote:** Spring Batch (para importação de produtos)
- **Containerização:** Docker (cada microsserviço possui seu próprio Dockerfile)
- **Geração de Código:** Openapi Generator (para geração de clientes HTTP), exclusivamente para o microsserviço de produtos.
- **Orquestração:** Docker Compose (utilizado no repositório principal para orquestrar todos os microsserviços)

## Estrutura dos Microsserviços
Cada microsserviço é responsável por uma funcionalidade específica:

### Microsserviço de Gerenciamento de Clientes
Responsável por todas as operações CRUD relacionadas a clientes.

### Microsserviço de Catálogo de Produtos
Gerencia informações dos produtos, incluindo estoque e importação em massa via Spring Batch.

### Microsserviço de Gestão de Pedidos
Centraliza o processamento de pedidos e se comunica com os microsserviços de clientes, produtos e logística.

### Microsserviço de Logística de Entrega
Gerencia a logística de entrega, incluindo rastreamento e atribuição de entregadores. Utiliza PostgreSQL para persistência de dados.

## Repositórios dos Microsserviços
Cada microsserviço está hospedado em um repositório separado para facilitar a manutenção e escalabilidade do sistema. Abaixo estão os links para cada repositório:

- **Gerenciamento de Clientes:** [https://github.com/fernandoarag/customers-api]
- **Catálogo de Produtos:** [https://github.com/iagoomes/tech-challenge-product]
- **Gestão de Pedidos:** [https://github.com/yago-souza/order-api/tree/master]
- **Logística de Entrega:** [https://github.com/FelipeShai/logistics]

## Como Executar o Projeto
1. Clone o repositório principal (this) contendo o `docker-compose.yml`.
2. No diretório raiz do projeto, execute o comando:
   ```sh
   docker-compose up --build
   ```
   Com esse comando será executados os Dockerfiles de cada microsserviço.
3. Utilize as APIs documentadas para interagir com o sistema.


## Documentação das APIs
A documentação das APIs de cada microsserviço está disponível nos links abaixo:

### Microsserviço de Gerenciamento de Clientes
- **Swagger:** [http://localhost:8080/customers-api/swagger-ui.html]

### Microsserviço de Catálogo de Produtos
- **Swagger:** [http://localhost:8081/products-api/swagger-ui.html]

### Microsserviço de Gestão de Pedidos
- **Swagger:** [http://localhost:8082/orders-api/swagger-ui.html]

### Microsserviço de Logística de Entrega
- **Swagger:** [http://localhost:8083/logistics-api/swagger-ui.html]

## Autores
- Fernando Aragão
- Iago Gomes
- Yago Souza
- Felipe Shai
```