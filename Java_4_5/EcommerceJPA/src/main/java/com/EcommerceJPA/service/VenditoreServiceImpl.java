package com.EcommerceJPA.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EcommerceJPA.dto.VenditoreDTO;
import com.EcommerceJPA.entity.Venditore;
import com.EcommerceJPA.mapper.MapperVenditoreProdotto;
import com.EcommerceJPA.repository.VenditoreRepository;


@Service
public class VenditoreServiceImpl implements VenditoreService{

	// 1.Inserisci nuovo venditore
	// 2.Visualizza un venditore per ID
	// 3.Visualizza dati base del venditore (tutti i dati, tranne i prodotti) tramite ID
	// 4.Modifica password di un venditore (tramite ID) e lo torna aggiornato
	// 5.Aggiungi un prodotto ad un venditore esistente (tramite ID)
	// 6.Modifica la quantità di un prodotto relativo ad un venditore
	
		@Autowired
		private VenditoreRepository vr;
		
		@Override
		public VenditoreDTO inserisci(VenditoreDTO vdto) {
		    // Controllo se esiste già un venditore con lo stesso ID
		    if (!vr.findById(vdto.getId()).isPresent()) {
		        Venditore entity = MapperVenditoreProdotto.toEntity(vdto);
		        Venditore saved = vr.save(entity);
		        return MapperVenditoreProdotto.toDTO(saved);
		    }
		    return null; // oppure lancia eccezione, dipende da come vuoi gestire
		}
		
}
