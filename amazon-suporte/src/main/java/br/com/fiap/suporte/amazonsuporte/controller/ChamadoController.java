package br.com.fiap.suporte.amazonsuporte.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.suporte.amazonsuporte.model.Chamado;
import br.com.fiap.suporte.amazonsuporte.repository.ChamadoRepository;

@RestController
@RequestMapping("/chamado")
public class ChamadoController {
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@PostMapping
	public Chamado adicionar(@Valid @RequestBody Chamado chamado) {
		return chamadoRepository.save(chamado);
	}
	
	@GetMapping("/{id}")
	public Optional<Chamado> buscar(@PathVariable Long id) {
		Optional<Chamado> chamado = chamadoRepository.findById(id);
		return chamado;
	}

}
