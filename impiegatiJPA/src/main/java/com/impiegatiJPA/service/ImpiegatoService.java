package com.impiegatiJPA.service;

import java.util.List;

import com.impiegatiJPA.dto.ImpiegatoDTO;

public interface ImpiegatoService {
	public ImpiegatoDTO assumi(ImpiegatoDTO imp);
	public ImpiegatoDTO cercaPerMatricola(int matricola);
	public List<ImpiegatoDTO> visualizzaTutti();
	public ImpiegatoDTO cancella(int matricola);
	public ImpiegatoDTO modifica(int matricola, double nuovoSalario);
}
