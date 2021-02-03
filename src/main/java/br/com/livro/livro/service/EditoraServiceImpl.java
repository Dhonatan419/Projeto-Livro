package br.com.livro.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.livro.livro.model.Editora;
import br.com.livro.livro.repository.EditoraRepository;

@Service
public class EditoraServiceImpl implements EditoraService {
	
	@Autowired
	EditoraRepository editoraRepository;
	
	
	@Override
	public List<Editora> findAll(){
		return editoraRepository.findAll(Sort.by("nome"));
	}
	
	@Override
	public Editora save(Editora editora) {
		
		try {
			
			return editoraRepository.save(editora);
			
			
		} catch (Exception e) {
			return null;
		}
		
		
	}

}
