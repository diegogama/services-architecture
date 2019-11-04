package br.com.fiap.produto.amazonproduto.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@NotNull
	private String descricao;
	
	private String tag;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "detalhe_id", referencedColumnName = "id")
	private DetalheProduto detalhe;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "genero_id", referencedColumnName = "id")
	@JsonIgnore
	private GeneroProduto genero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public DetalheProduto getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(DetalheProduto detalhe) {
		this.detalhe = detalhe;
	}

	public GeneroProduto getGenero() {
		return genero;
	}

	public void setGenero(GeneroProduto genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}