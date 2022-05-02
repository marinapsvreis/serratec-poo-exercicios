CREATE TABLE produto (codigo_produto serial PRIMARY KEY, 
						nome varchar(30) UNIQUE NOT NULL,
						descricao text,
						preco numeric CHECK (preco > 0) NOT NULL,
						quantidade_estoque SMALLINT DEFAULT 0);
						

INSERT INTO PRODUTO (nome, descricao, preco, quantidade_estoque) VALUES('Macarrão','Adria',6.65,10);
INSERT INTO PRODUTO (nome, descricao, preco, quantidade_estoque) VALUES('Farinha de Trigo','Boa Sorte',2.5,8);
INSERT INTO PRODUTO (nome, descricao, preco, quantidade_estoque) VALUES('Sal','Cisne',2.5,100);
INSERT INTO PRODUTO (nome, descricao, preco, quantidade_estoque) VALUES('Atum','Gomes da Costa',6.8,42);
INSERT INTO PRODUTO (nome, descricao, preco, quantidade_estoque) VALUES('Leite Condensado','Nestle',5.9,40);
INSERT INTO PRODUTO (nome, descricao, preco, quantidade_estoque) VALUES('Creme de Leite','Pirancajuba',2.8,15);
INSERT INTO PRODUTO (nome, descricao, preco, quantidade_estoque) VALUES('Arroz','Carreteiro',7.5,4);
INSERT INTO PRODUTO (nome, descricao, preco, quantidade_estoque) VALUES('Neosoro','EMS',17.5,4);