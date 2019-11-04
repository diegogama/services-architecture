package br.com.fiap.pedido.amazonpedido.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.pedido.amazonpedido.model.Pedido;
import br.com.fiap.pedido.amazonpedido.repository.PedidoRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
		
	@GetMapping("/{id}")
	public Optional<Pedido> buscar(@PathVariable Long id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		return pedido;
	}

}
