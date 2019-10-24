package br.com.fiap.produto.amazonproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.produto.amazonproduto.model.DetalheProduto;

public interface DetalheProdutoRepository extends JpaRepository<DetalheProduto, Long> {

}
