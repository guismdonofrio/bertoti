# Locadora de Filmes

Bem-vindo ao sistema de **Locadora de Filmes**! Este é um projeto full-stack desenvolvido com **Java Spring Boot** no backend e **HTML/CSS/JS** puro no frontend.

Este documento detalha as instruções de configuração, execução e uso da aplicação.

---

## Manual de Execução (Desenvolvedor)

Siga os passos abaixo para rodar o projeto localmente na sua máquina.

### Pré-requisitos
* **Java Development Kit (JDK):** Instalado e configurado nas variáveis de ambiente.
* **Banco de Dados Relacional:** (ex: MySQL ou PostgreSQL) instalado e rodando.
* **IDE:** IntelliJ IDEA, Eclipse ou VS Code.

### 1. Configuração do Banco de Dados
1. Abra o seu gerenciador de banco de dados (ex: DBeaver, MySQL Workbench).
2. Execute o script de criação do banco de dados e das tabelas utilizando o arquivo `locadora_filmes.sql` disponível na raiz do projeto.
3. Verifique o arquivo `src/main/resources/application.properties` para garantir que as credenciais de acesso ao banco (URL, usuário e senha) estão corretas para o seu ambiente local.

### 2. Executando a Aplicação
O projeto utiliza o **Maven** como gerenciador de dependências (`pom.xml`). Você pode rodá-lo de duas formas:

**Opção A: Via Linha de Comando (Terminal)**
Na pasta raiz do projeto (onde está o arquivo `pom.xml`), execute o Maven Wrapper:
* **Windows:** `mvnw.cmd spring-boot:run`
* **Linux/Mac:** `./mvnw spring-boot:run`

**Opção B: Via IDE**
Abra o projeto na sua IDE, navegue até `src/main/java/com/sessaonoturna/locadora/` e execute a classe principal `LocadoraApplication.java`.

### 3. Acessando a Aplicação
Com a aplicação rodando, abra o seu navegador e acesse:
`http://localhost:8080` (A porta padrão do Spring Boot).

O Spring Boot servirá automaticamente os arquivos estáticos do frontend (`index.html`, `style.css` e `index.js`) que estão na pasta `src/main/resources/static/`.

---

## Manual do Usuário

A interface da Locadora de Filmes foi projetada para ser simples e intuitiva.

### Visão Geral
Ao acessar a página principal (`index.html`), você terá acesso ao catálogo de filmes. O sistema é integrado a uma API que consulta a entidade `Filme` diretamente no banco de dados através do `FilmeRepository`.

### Funcionalidades (O que você pode fazer)
* **Visualizar Filmes:** A tela principal exibe a lista de todos os filmes disponíveis na locadora.
* **Cadastrar/Gerenciar Filmes:** Através dos formulários e botões na interface, você pode interagir com o sistema para registrar novos títulos na base de dados.
* *Nota:* Toda a interação na tela é controlada pelo script `index.js`, que se comunica de forma transparente com o servidor. Estilos visuais são definidos no `style.css`.

### Resolução de Problemas Comuns
* **A página não carrega:** Verifique se o terminal onde a aplicação foi iniciada está aberto e se não apresenta mensagens de erro (como "Port in use").
* **Não aparece nenhum filme:** Certifique-se de que o script `locadora_filmes.sql` foi executado corretamente e se as configurações no `application.properties` estão apontando para o banco certo.