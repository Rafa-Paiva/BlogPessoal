package br.org.generation.lojadejogos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
=======
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
>>>>>>> camadas
	
	@NotNull
	@Size(min = 3,max = 20, message = "Digite um gênero que contenha entre 3 à 20 letras.")
	private String genero;
	
<<<<<<< HEAD
	@NotNull
	@Size(min = 5,max = 20, message = "Digite o nome de uma plataforma que contenha entre 5 à 20 letras.")
	private String plataforma;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
=======
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
>>>>>>> camadas

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
