package br.com.livro.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livro.livro.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
