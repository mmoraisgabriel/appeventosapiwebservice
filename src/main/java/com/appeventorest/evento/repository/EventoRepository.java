package com.appeventorest.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appeventorest.evento.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {
	
	Evento findByCodigo(long codigo);

}
