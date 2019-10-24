package br.com.fiap.produto.amazonproduto.contoller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.produto.amazonproduto.model.Produto;
import br.com.fiap.produto.amazonproduto.repository.ProdutoRepository;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public Produto adicionar(@Valid @RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@GetMapping
	public List<Produto> listar() {
		return produtoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> buscar(@PathVariable Long id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto;
	}
	
	@GetMapping("/obter-por-genero/{genero_id}")
	public Optional<Produto> buscarPorGenero(@PathVariable Long genero_id) {
		Optional<Produto> produto = produtoRepository.buscarPorGenero(genero_id);
		return produto;
	}
	
	@GetMapping("/obter-por-tag/{tag}")
	public List<Produto> listarPorTag(@PathVariable String tag) {
		return produtoRepository.buscarTag(tag);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produto> atualizar(@PathVariable Long id, 
			@Valid @RequestBody Produto produto) {
		Produto existente = produtoRepository.getOne(id);
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(produto, existente, "id");
		
		existente = produtoRepository.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Produto produto = produtoRepository.getOne(id);
		
		if (produto == null) {
			return ResponseEntity.notFound().build();
		}
		
		produtoRepository.delete(produto);
		
		return ResponseEntity.noContent().build();
	}

}
