package br.com.livro.livro.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;





@Entity (name="livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	@Size(min = 30 , max = 120)
	private String isbn;
	
	@NonNull
	@Size(min = 10 , max = 120)
	private String titulo;
	
	@NonNull
	@Size(min = 0 , max = 120)
	private double preco;
	
	
	@OneToOne
	@JoinColumn(name="editora_id",
				referencedColumnName = "id")
	private Editora editora;

	@ManyToMany
	@JoinTable(name = "livro_autor",
				joinColumns = @JoinColumn(name="livro_id"),
				inverseJoinColumns = @JoinColumn(name= "autor_id"))
	private List<Autor> autores;	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	
	

	@Override
	public String toString() {
		return "Livro [id=" + id + ", isbn=" + isbn + ", titulo=" + titulo + ", preco=" + preco + ", editora=" + this.editora
				+ "autor= " + this.autores +"]";
	}


}
