package br.com.livro.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.livro.livro.model.Livro;
import br.com.livro.livro.repository.LivroRepository;

@Service
public class LivroServiceImpl implements LivroService {

	@Autowired
	LivroRepository livroRepository;
	
	
	@Override
	public List<Livro> findAll(){
		return livroRepository.findAll(Sort.by("nome")) ;
	}
	
	@Override
	public Livro save(Livro livro){
		
		
		try {	
				/*if (titulo != null || titulo.equals(select)) {
					
					return null;
				}else {*/
					return livroRepository.save(livro);
				}
				
			
			
		 catch (Exception e) {
			return null;
			
		}
	}
}
