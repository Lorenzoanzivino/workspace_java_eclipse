package com.impiegatiJPA.mapper;

import com.impiegatiJPA.dto.ImpiegatoDTO;
import com.impiegatiJPA.entity.Impiegato;

public class MapperImpiegato {
	
	public static ImpiegatoDTO impiegatoEntityDTO(Impiegato imp) {
		ImpiegatoDTO idto = new ImpiegatoDTO();
		idto.setMatricola(imp.getMatricola());
		idto.setNome(imp.getNome());
		idto.setCognome(imp.getCognome());
		idto.setSalarioMensile(imp.getSalarioMensile());
		idto.setDataAssunzione(imp.getDataAssunzione());
		return idto;
	}
	
	public static Impiegato impiegatoDTOEntity(ImpiegatoDTO idto) {
		Impiegato imp = new Impiegato();
		imp.setMatricola(idto.getMatricola());
		imp.setNome(idto.getNome());
		imp.setCognome(idto.getCognome());
		imp.setSalarioMensile(idto.getSalarioMensile());
		imp.setDataAssunzione(idto.getDataAssunzione());
		return imp;
	}
}
