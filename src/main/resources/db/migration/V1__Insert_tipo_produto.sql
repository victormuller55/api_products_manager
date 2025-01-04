CREATE TABLE tbl_tipo_produto (
    id_tipo_produto INT AUTO_INCREMENT PRIMARY KEY,
    descricao_tipo_produto VARCHAR(255)
);

CREATE TABLE tbl_produto (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    descricao_produto VARCHAR(255),
    preco_produto DOUBLE,
    peso_produto DOUBLE,
    id_tipo_produto INT NOT NULL,
    frete_valor_produto DOUBLE,
    porcentagem_desconto_produto DOUBLE,
    data_criacao_produto DATETIME,
    CONSTRAINT fk_tipo_produto FOREIGN KEY (id_tipo_produto) REFERENCES tbl_tipo_produto(id_tipo_produto)
);

INSERT INTO tbl_tipo_produto (descricao_tipo_produto)
VALUES
    ('Fisico'),
    ('Digital');