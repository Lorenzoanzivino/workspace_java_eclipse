package com.Dev_Inventory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Resource {
	
	@Id
    private String id;
	
	private String nome, descrizione, url, categoria;
    private LocalDate dataInserimento;

    public Resource() {
    }

    public Resource(String id, String nome, String descrizione, String url, String categoria) {
        this.setId(id);
        this.setNome(nome);
        this.setDescrizione(descrizione);
        this.setUrl(url);
        this.setCategoria(categoria);
        this.setDataInserimento(LocalDate.now());
    }


    public String getId() { 
    	return id; 
    	}
    public void setId(String id) { 
    	this.id = id; 
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

    public LocalDate getDataInserimento() { 
    	return dataInserimento; 
    	}
    public void setDataInserimento(LocalDate dataInserimento) { 
    	this.dataInserimento = dataInserimento; 
    	}
    
    @Override
    public boolean equals(Object o) {
    	if(this == o) return true;
    	if (o == null || getClass() != o.getClass()) return false;
    	Resource resource = (Resource) o;
    	return Objects.equals(id,  resource.id);
    }
    
    @Override
    public int hashCode() {
    	return Objects.hashCode(id);
    }
}