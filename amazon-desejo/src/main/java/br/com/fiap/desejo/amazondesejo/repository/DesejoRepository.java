package br.com.fiap.desejo.amazondesejo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.desejo.amazondesejo.model.Desejo;

public interface DesejoRepository extends JpaRepository<Desejo, Long> {

}
