package br.com.fiap.pedido.amazonpedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.pedido.amazonpedido.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
