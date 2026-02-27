package com.impiegatiJPA.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impiegatiJPA.dao.ImpiegatoDAO;
import com.impiegatiJPA.dto.ImpiegatoDTO;
import com.impiegatiJPA.entity.Impiegato;
import static com.impiegatiJPA.mapper.MapperImpiegato.*;

@Service
public class ImpiegatoServiceImpl implements ImpiegatoService{

	@Autowired
	private ImpiegatoDAO impiegatoDAO;
	
	@Override
	public ImpiegatoDTO assumi(ImpiegatoDTO imp) {
		if (!impiegatoDAO.findById(imp.getMatricola()).isPresent()) {
			
			Impiegato saved = impiegatoDAO.save(impiegatoDTOEntity(imp));
			return impiegatoEntityDTO(saved);
			
		}return null;

	}
	
	@Override
	public ImpiegatoDTO cercaPerMatricola(int matricola) {
        return impiegatoEntityDTO(impiegatoDAO.findById(matricola).get());
    }
	
	@Override
	public List<ImpiegatoDTO> visualizzaTutti(){
		return impiegatoDAO.findAll().stream()
				.map(i -> impiegatoEntityDTO(i))
				.collect(Collectors.toList());
	}
	
	@Override
	public ImpiegatoDTO cancella(int matricola) {
		if(impiegatoDAO.findById(matricola).isPresent()){
			Impiegato deleted = impiegatoDAO.findById(matricola).get();
			impiegatoDAO.deleteById(matricola);
			return impiegatoEntityDTO(deleted);
		}return null;
	}
	
	@Override
	public ImpiegatoDTO modifica(int matricola, double nuovoSalario) {
		if(impiegatoDAO.findById(matricola).isPresent()){
			Impiegato patch = impiegatoDAO.findById(matricola).get();
			patch.setSalarioMensile(nuovoSalario);
			return impiegatoEntityDTO(patch);
		}return null;
	}
	
}
