package com.sessaonoturna.locadora;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    List<Filme> findByDisponivelTrue();

    List<Filme> findByGeneroIgnoreCase(String genero);

    List<Filme> findByNomeContainingIgnoreCase(String nome);
}
