package com.Dev_Inventory.entity;

import java.time.LocalDate;

public class Resource {
	private final String id;
	private String nome, descrizione, url, categoria;
	private LocalDate dataInserimento;
	
	public Resource(String id, String nome, String descrizione, String url, String categoria, LocalDate dataInserimento) {
		this.id = id;
		this.setNome(nome);
		this.setDescrizione(descrizione);
		this.setUrl(url);
		this.setCategoria(categoria);
		this.dataInserimento = dataInserimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getId() {
		return id;
	}

	public LocalDate getDataInserimento() {
		return dataInserimento;
	}
	
}
