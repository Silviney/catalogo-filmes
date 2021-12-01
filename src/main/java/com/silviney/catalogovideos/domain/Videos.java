package com.silviney.catalogovideos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Videos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	private String imagemUrl;
	@ManyToOne
	private Produtor produtor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nombre) {
		this.nome = nombre;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getImagemUrl() {
		return imagemUrl;
	}
	
	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public Produtor getProdutor() {
		return produtor;
	}

	public void setProdutor(Produtor produtor) {
		this.produtor = produtor;
	}

	@Override
	public String toString() {
		return "Videos [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", imagemUrl=" + imagemUrl
				+ ", produtor=" + produtor.getId() + "]";
	}
	
	
}
