--insert 1
insert into detalhe_produto (id, cor, valor, marca) values (null, 'preto', '499,00', 'Amazon');
insert into genero_produto (id, descricao) values (null, 'eletronicos');
insert into produto (id, nome, descricao, tag, detalhe_id, genero_id) values (null, 'Kindle', 'Kindle Geração 8', 'leitor', 1, 1);

--insert 2
insert into detalhe_produto (id, cor, valor, marca) values (null, 'preto', '899,00', 'Amazon');
insert into genero_produto (id, descricao) values (null, 'eletronicos');
insert into produto (id, nome, descricao, tag, detalhe_id, genero_id) values (null, 'Kindle', 'Kindle Geração 9', 'leitor', 1, 1);
