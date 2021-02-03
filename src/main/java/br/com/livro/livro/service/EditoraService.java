package br.com.livro.livro.service;

import java.util.List;


import br.com.livro.livro.model.Editora;

public interface EditoraService {

	public List<Editora> findAll();
	public Editora save(Editora editora);
}
