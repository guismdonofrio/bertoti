# Locadora de Filmes (com MySQL)

API em Spring Boot com CRUD de filmes (GET, POST, PUT, DELETE), persistência em **MySQL** via **Spring Data JPA** e um front-end em HTML/JS puro (com axios) que consome a API.

## Requisitos
- Java 11+
- Maven (ou usar o `./mvnw` incluso)
- MySQL Server rodando localmente (ou em container)

## Configuração do banco

1. Crie o banco (ou deixe o `createDatabaseIfNotExist=true` do `application.properties` criar sozinho):
   ```sql
   CREATE DATABASE locadora_db;
   ```

2. Ajuste usuário e senha em `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/locadora_db?useSSL=false&serverTimezone=UTC&createDatabaseIfNotExist=true
   spring.datasource.username=root
   spring.datasource.password=sua_senha
   ```

3. O Hibernate cria/atualiza a tabela `filme` automaticamente (`spring.jpa.hibernate.ddl-auto=update`), e o `CommandLineRunner` popula alguns filmes de exemplo na primeira execução (se a tabela estiver vazia).

## Execução
```
./mvnw clean spring-boot:run
```
Acesso ao front-end em `http://localhost:8080/`

## Estrutura do backend

- **`Filme`** (`@Entity`) — id (auto-incremento), nome, gênero, ano de lançamento, disponibilidade.
- **`FilmeRepository`** (`JpaRepository<Filme, Long>`) — CRUD pronto + consultas derivadas (`findByDisponivelTrue`, `findByGeneroIgnoreCase`, `findByNomeContainingIgnoreCase`), sem precisar escrever SQL.
- **`FilmeController`** — expõe os endpoints REST e delega toda a persistência ao repositório (nada mais em memória).

## Endpoints
| Método | Rota                    | Descrição                              |
|--------|-------------------------|-----------------------------------------|
| GET    | `/filmes`               | Lista todos os filmes                  |
| GET    | `/filmes/{id}`          | Busca um filme por id                  |
| GET    | `/filmes/disponiveis`   | Lista apenas filmes disponíveis        |
| GET    | `/filmes/buscar?nome=`  | Busca filmes por nome (parcial)        |
| POST   | `/filmes`                | Cria um novo filme                     |
| PUT    | `/filmes/{id}`          | Atualiza (ou cria, se não existir)     |
| DELETE | `/filmes/{id}`          | Remove um filme                        |

## Front-end
`index.html` + `index.js` (axios) fazem as requisições para os endpoints acima: listar em tabela, adicionar via modal, editar nome inline e excluir, além de busca por nome com debounce.
