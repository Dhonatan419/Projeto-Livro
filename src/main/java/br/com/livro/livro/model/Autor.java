package br.com.livro.livro.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	private Date dataNascimento ;
	
	@ManyToMany(mappedBy = "autores")
	private List<Livro> livros;

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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nome=" + nome + ", sobrenomenome=" + sobrenomenome + ", dataNascimento="
				+ dataNascimento + "]";
	}
	
	
	
}
