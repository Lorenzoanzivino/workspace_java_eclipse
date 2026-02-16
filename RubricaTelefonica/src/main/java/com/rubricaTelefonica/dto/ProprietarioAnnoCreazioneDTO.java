package com.rubricaTelefonica.dto;

import java.time.LocalDate;

public class ProprietarioAnnoCreazioneDTO {
	
	private String nomeProprietario;
	private LocalDate dataCreazione;
	public ProprietarioAnnoCreazioneDTO(String nomeProprietario, LocalDate dataCreazione) {
		this.nomeProprietario = nomeProprietario;
		this.dataCreazione = dataCreazione;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	public LocalDate getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(LocalDate dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

}
