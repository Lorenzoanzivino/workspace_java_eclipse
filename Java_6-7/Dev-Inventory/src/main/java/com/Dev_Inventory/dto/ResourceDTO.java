package com.Dev_Inventory.dto;

import java.time.LocalDate;

public class ResourceDTO {
	private String id, nome, descrizione, url, categoria;
	private LocalDate dataInserimento;
	
	public ResourceDTO() {}
	
	public ResourceDTO(String id, String nome, String descrizione, String url, String categoria, LocalDate dataInserimento) {
		this.id = id;
		this.setNome(nome);
		this.setDescrizione(descrizione);
		this.setUrl(url);
		this.setCategoria(categoria);
		this.setDataInserimento(dataInserimento);
	}
	
	public String getiId() {
		return id;
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
    public void setDataInserimento(LocalDate dataInserimento) { 
    	this.dataInserimento = dataInserimento; 
    	}
	
}
