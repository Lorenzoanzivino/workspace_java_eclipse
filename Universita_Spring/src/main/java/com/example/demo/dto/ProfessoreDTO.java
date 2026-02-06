package com.example.demo.dto;

public class ProfessoreDTO {

    private String id, nome, cognome, materia;

    public ProfessoreDTO (String id, String nome, String cognome, String materia) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.materia = materia;
    }

    public String getId() { return id; }

    public String getNome() { return nome; }

    public String getCognome() { return cognome; }

    public String getMateria() { return materia; }
    
}
