package br.com.livro.livro.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity (name = "autor") 
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NonNull
	@Size (max = 40)
	private String nome ;
	
	@NonNull
	@Size (max = 60)
	private String sobrenomenome ;
	
	@NonNull
	@Size (max = 130)
	private String dataNascimento ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenomenome() {
		return sobrenomenome;
	}

	public void setSobrenomenome(String sobrenomenome) {
		this.sobrenomenome = sobrenomenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nome=" + nome + ", sobrenomenome=" + sobrenomenome + ", dataNascimento="
				+ dataNascimento + "]";
	}
	
	
	
}
