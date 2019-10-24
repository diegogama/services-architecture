package br.com.fiap.produto.amazonproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.produto.amazonproduto.model.GeneroProduto;

public interface GeneroProdutoRepository extends JpaRepository<GeneroProduto, Long> {

}
