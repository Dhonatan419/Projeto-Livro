package br.com.livro.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.livro.livro.model.Livro;

//iterface esqueleto, onde fica a estrutura
public interface LivroRepository extends JpaRepository<Livro, Long>{

	
	
}
