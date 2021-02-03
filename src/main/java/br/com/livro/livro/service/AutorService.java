package br.com.livro.livro.service;

import java.util.List;



import br.com.livro.livro.model.Autor;


public interface AutorService{

	public List<Autor> findAll();
	public Autor save(Autor autor);
	
	
	
}
