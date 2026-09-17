USE locadora_db;

CREATE TABLE IF NOT EXISTS filme (
    id              BIGINT       NOT NULL AUTO_INCREMENT,
    nome            VARCHAR(255) NOT NULL,
    genero          VARCHAR(255),
    ano_lancamento  INT          NOT NULL,
    disponivel      BIT(1)       NOT NULL DEFAULT 1,
    PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;



select * from filme;