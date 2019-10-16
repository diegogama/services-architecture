package br.com.fiap.produto.amazonproduto.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fiap.produto.amazonproduto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	@Query(value = "SELECT * FROM Produto WHERE genero_id = ?1", nativeQuery = true)
	Optional<Produto> buscarPorGenero(Long genero_id);

	@Query(value = "SELECT * FROM Produto WHERE tag = ?1", nativeQuery = true)
	List<Produto> buscarTag(String tag);
}
