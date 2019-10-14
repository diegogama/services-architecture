package br.com.fiap.produto.amazonproduto.contoller;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.produto.amazonproduto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
