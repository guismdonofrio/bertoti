# Acadêmico

Este repositório guarda todos os projetos, atividades e estudos desenvolvidos durante as aulas e disciplinas acadêmicas. Ele está organizado de forma evolutiva, separado por semestres e matérias.

## Estrutura do Repositório

O repositório está estruturado nas seguintes pastas principais:

### 2º Semestre
* **Disciplina:** Engenharia de Software.
* **Atividades:** Contém projetos focados em Lógica e Orientação a Objetos em Java.
    * **Projeto Destaque:** Sistema `BibliotecaJogos` (arquivos `Jogo.java`, `BibliotecaJogos.java` e `Main.java`).

### 3º Semestre
* **Projeto:** Locadora de Filmes (`locadora-filmes`).
* **Descrição:** Uma API/Aplicação Web desenvolvida utilizando o framework **Spring Boot** (arquitetura Maven).
* **Estrutura do Projeto Locadora:**
    * **Backend (Java):** Classes como `LocadoraApplication.java`, `Filme.java` e `FilmeRepository.java`.
    * **Frontend:** Interface de usuário na pasta `static` contendo `index.html`, `style.css` e `index.js`.
    * **Banco de Dados:** Script estrutural disponibilizado no arquivo `locadora_filmes.sql`.

---

## Tecnologias Utilizadas

Através dos projetos deste repositório, as seguintes tecnologias e ferramentas foram aplicadas:

* **Java** (Orientação a Objetos)
* **Spring Boot** & **Maven** (Desenvolvimento da aplicação web/API da Locadora)
* **HTML5, CSS3 e JavaScript** (Frontend da Locadora)
* **SQL** (Modelagem do banco de dados)

---

## Como Executar os Projetos

Cada semestre e projeto possui suas particularidades para execução:

1. **Projetos em Java Puro (2º Semestre):** Importe a pasta `src/atv` para a sua IDE de preferência (IntelliJ, Eclipse, VSCode) e execute o arquivo `Main.java`.
2. **Projetos Spring Boot (3º Semestre - Locadora):**
    * Navegue até a pasta `terceiro_semestre/locadora-filmes/locadora-filmes`.
    * Utilize o wrapper do Maven (`mvnw` ou `mvnw.cmd` para Windows) executando `mvn spring-boot:run` ou inicie a aplicação diretamente pela classe `LocadoraApplication.java`.

*Nota: Alguns subdiretórios contêm seus próprios arquivos `README.md` (como o da pasta de locadora) com explicações mais detalhadas sobre aquele projeto específico.*