package br.com.fiap.suporte.amazonsuporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.suporte.amazonsuporte.model.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
