package br.com.livro.livro.service;

import java.util.List;


import br.com.livro.livro.model.Livro;

public interface LivroService {
	
	public List<Livro> findAll();
	public Livro save(Livro livro);

}
