package br.com.fiap.produto.amazonproduto.contoller;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.produto.amazonproduto.model.GeneroProduto;

public interface GeneroProdutoRepository extends JpaRepository<GeneroProduto, Long> {

}
