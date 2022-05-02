create table cliente(codigo serial primary key,
			nome varchar(50),
			telefone varchar(11),
			email varchar(30));

insert into cliente (nome, telefone, email) 
values("João", "22431000", "joao@gmail.com");

insert into cliente (nome, telefone, email) 
values("Maria", "22421000", "maria@gmail.com");