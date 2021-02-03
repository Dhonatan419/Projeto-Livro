package br.com.livro.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.livro.livro.model.Autor;
import br.com.livro.livro.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	AutorRepository autorRepository;
	
	@Override
	public List<Autor> findAll(){
		return autorRepository.findAll(Sort.by("nome"));
	}
	
	@Override
	public Autor save(Autor autor){
		try {
			
		return autorRepository.save(autor);
		
		} catch (Exception e) {
			return null;
			
		}
	}
}
