package br.com.fiap.desejo.amazondesejo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.desejo.amazondesejo.model.Desejo;
import br.com.fiap.desejo.amazondesejo.repository.DesejoRepository;

@EnableDiscoveryClient
@EnableCircuitBreaker
@RestController
@RequestMapping("/desejo")
public class DesejoController {
	
	@Autowired
	private DesejoRepository desejoRepository;
	
	@PostMapping
	public Desejo adicionar(@Valid @RequestBody Desejo desejo) {
		return desejoRepository.save(desejo);
	}
	
	@GetMapping("/{id}")
	public Optional<Desejo> buscar(@PathVariable Long id) {
		Optional<Desejo> desejo = desejoRepository.findById(id);
		return desejo;
	}

}
