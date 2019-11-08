package br.com.fiap.frete.amazonfrete.contorller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.frete.amazonfrete.model.Frete;

@RestController
@RequestMapping("/frete")
public class FreteController {

	@PostMapping
	public Double calcular(@Valid @RequestBody Frete frete) {
		Double valor = 5.0;
		Double vlPeso = 0.190;
		Double peso = Double.parseDouble(frete.peso);	
		valor = vlPeso * peso;
		return valor;
	}
	
}
